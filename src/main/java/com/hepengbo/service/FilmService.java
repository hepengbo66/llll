package com.hepengbo.service;

import java.util.List;

import com.hepengbo.pojo.Classify;
import com.hepengbo.pojo.Film;
import com.hepengbo.pojo.Query;

public interface FilmService {
	
	//查询
	public List<Film> getlist(Query q);
	
	//添加
	public int addFilm(Film f,String[] arr);
	
	//查询
	public List<Classify> clist();
	
	//批删
	public int delete(String ids);
	
}
