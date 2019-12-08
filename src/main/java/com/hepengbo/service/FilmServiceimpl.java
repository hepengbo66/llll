package com.hepengbo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hepengbo.mapper.FilmMapper;
import com.hepengbo.pojo.Classify;
import com.hepengbo.pojo.Film;
import com.hepengbo.pojo.Query;
@Service
public class FilmServiceimpl implements FilmService {

	@Autowired
	private FilmMapper mapper;
	
	//查询
	public List<Film> getlist(Query q) {
		Page<Film> page = PageHelper.startPage(q.getPageNum(), q.getPageSize());
		List<Film> getlist = mapper.getlist(q);
		PageInfo<Film> f = new PageInfo<Film>(page);
		q.setPageNum(f.getPageNum());
		q.setPages(f.getPages());
		return getlist;
	}
	//添加
	public int addFilm(Film f,String[] arr) {
		mapper.addFilm(f);
		for (String s : arr) {
			int cid = Integer.parseInt(s);
			mapper.addTFC(f.getId(), cid);
		}
		return 0;
	}
	//查询分类
	public List<Classify> clist() {
		return mapper.clist();
	}
	//批删
	public int delete(String ids) {
		List<String> st = new ArrayList<String>();
		String[] split = ids.split(",");
		for (String s : split) {
			st.add(s);
		}
		mapper.delete(st);
		mapper.deleteTFC(st);
		return 0;
	}

}
