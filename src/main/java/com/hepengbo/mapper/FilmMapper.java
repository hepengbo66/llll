package com.hepengbo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hepengbo.pojo.Classify;
import com.hepengbo.pojo.Film;
import com.hepengbo.pojo.Query;
import com.hepengbo.pojo.User;

public interface FilmMapper {
	
	//查询
	public List<Film> getlist(Query q);
	
	//添加
	public int addFilm(Film f);
	
	//添加中间表
	public int addTFC(@Param("fid")int fid,@Param("cid")int cid);
	
	//查询
	public List<Classify> clist();
	
	//批删
	public int delete(List<String> ids);
	
	//删除中间表
	public int deleteTFC(List<String> ids);
	
	//添加数量表
	public int adduser(User u);
}
