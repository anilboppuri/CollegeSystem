package com.ust.model;

/**
 * 
 */
public class Semester {
	
	int semId;
	int sub1;
	int sub2;
	int sub3;
	int sub4;
	int practical1;
	int practical2;
	
	
	
	
	
	
	public Semester() {
	}
	
	
	public Semester(int semId, int sub1, int sub2, int sub3, int sub4, int practical1, int practical2) {
		super();
		this.semId = semId;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
		this.practical1 = practical1;
		this.practical2 = practical2;
	}

	public int getSemId() {
		return semId;
	}
	public void setSemId(int semId) {
		this.semId = semId;
	}
	public int getSub1() {
		return sub1;
	}
	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}
	public int getSub2() {
		return sub2;
	}
	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}
	public int getSub3() {
		return sub3;
	}
	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}
	public int getSub4() {
		return sub4;
	}
	public void setSub4(int sub4) {
		this.sub4 = sub4;
	}
	public int getPractical1() {
		return practical1;
	}
	public void setPractical1(int practical1) {
		this.practical1 = practical1;
	}
	public int getPractical2() {
		return practical2;
	}
	public void setPractical2(int practical2) {
		this.practical2 = practical2;
	}

	@Override
	public String toString() {
		return "Semester [semId=" + semId + ", sub1=" + sub1 + ", sub2=" + sub2 + ", sub3=" + sub3 + ", sub4=" + sub4
				+ ", practical1=" + practical1 + ", practical2=" + practical2 + "]";
	}
	
	

}
