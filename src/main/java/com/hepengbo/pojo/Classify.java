package com.hepengbo.pojo;

import java.util.ArrayList;
import java.util.List;

public class Classify {
	
	private int cid;
	
	private String cname;
	
	private List<Film> films = new ArrayList<Film>();

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public List<Film> getFilms() {
		return films;
	}

	public void setFilms(List<Film> films) {
		this.films = films;
	}
	
	
	
}
