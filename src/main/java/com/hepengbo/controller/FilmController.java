package com.hepengbo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hepengbo.pojo.Classify;
import com.hepengbo.pojo.Film;
import com.hepengbo.pojo.Query;
import com.hepengbo.service.FilmService;

@Controller
public class FilmController {
	
	@Autowired
	private FilmService service;
	
	//查询
	@RequestMapping("query")
	public String getlist(Model m,Query q){
		List<Film> getlist = service.getlist(q);
		m.addAttribute("list",getlist);
		m.addAttribute("model", q);
		return "list";
	}
	
	//添加
	@RequestMapping("addFilm")
	@ResponseBody
	public boolean addfilm(Film f,String[] arr){
		service.addFilm(f, arr);
		return true;
	}
	
	//查询
	@RequestMapping("clist")
	@ResponseBody
	public List<Classify> clist(){
		List<Classify> clist = service.clist();
		return clist;
	}
	
	//批删
	@RequestMapping("delete")
	@ResponseBody
	public boolean delete(String ids){
		service.delete(ids);
		return true;
	}
	
}
