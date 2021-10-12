package com.zabdwi.api;

public class MarksStudent {
	private Integer idStudent;
	private Integer c;
	private Integer java;
	private Integer python;
	private Integer data_structure ;
	private Integer totalScore;
	
	
	
	public Integer getIdStudent() {
		return idStudent;
	}
	public void setIdStudent(Integer idStudent) {
		this.idStudent = idStudent;
	}
	public Integer getC() {
		return c;
	}
	public void setC(Integer c) {
		this.c = c;
	}
	public Integer getJava() {
		return java;
	}
	public void setJava(Integer java) {
		this.java = java;
	}
	public Integer getPython() {
		return python;
	}
	public void setPython(Integer python) {
		this.python = python;
	}
	public Integer getData_structure() {
		return data_structure;
	}
	public void setData_structure(Integer data_structure) {
		this.data_structure = data_structure;
	}	
	
	public Integer getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(Integer totalScore) {
		this.totalScore = totalScore;
	}

	@Override
	public String toString() {
		return "MarksStudent [id_Student=" + idStudent + ", c=" + c + ", java=" + java + ", python=" + python
				+ ", data_structure=" + data_structure + "Total Score" + totalScore + "]";
	}
}
