package com.test.dic.model;

public class Search {
	
	int mnum;
	String ko;
	String eng;
	String java_va;
	String col_va;
	
	public Search() {}
	
	public Search(int mnum, String ko, String eng, String java_va, String col_va) {
		this.mnum=mnum;
		this.ko=ko;
		this.eng=eng;
		this.java_va=java_va;
		this.col_va=col_va;		
	}
	
	
	public int getMnum() {
		return mnum;
	}
	public void setMnum(int mnum) {
		this.mnum = mnum;
	}
	
	public String getKo() {
		return ko;
	}
	public void setKo(String ko) {
		this.ko = ko;
	}
	
	public String getEng() {
		return eng;
	}
	public void setEng(String eng) {
		this.eng = eng;
	}
	
	public String getJava_va() {
		return java_va;
	}
	public void setJava_va(String java_va) {
		this.java_va = java_va;
	}
	
	public String getCol_va() {
		return col_va;
	}
	public void setCol_va(String col_va) {
		this.col_va = col_va;
	}
}
