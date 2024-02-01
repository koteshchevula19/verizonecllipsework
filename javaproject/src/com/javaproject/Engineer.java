package com.javaproject;

public class Engineer {

	private Integer engId;
	private String engName;
	private Integer engYear;
	private String engCourse;
	private Integer engDuration;
	
	
	Engineer engArray[]= {};	
	


	public Engineer(Integer engId, String engName, Integer engYear, String engCourse, Integer engDuration) {
		super();
		this.engId = engId;
		this.engName = engName;
		this.engYear = engYear;
		this.engCourse = engCourse;
		this.engDuration = engDuration;
	}

	Engineer(){
		
	}

	public Integer getEngId() {
		return engId;
	}

	public void setEngId(Integer engId) {
		this.engId = engId;
	}

	public String getEngName() {
		return engName;
	}

	public void setEngName(String engName) {
		this.engName = engName;
	}

	public Integer getEngYear() {
		return engYear;
	}

	public void setEngYear(Integer engYear) {
		this.engYear = engYear;
	}

	public String getEngCourse() {
		return engCourse;
	}

	public void setEngCourse(String engCourse) {
		this.engCourse = engCourse;
	}

	public Integer getEngDuration() {
		return engDuration;
	}

	public void setEngDuration(Integer engDuration) {
		this.engDuration = engDuration;
	}

	@Override
	public String toString() {
		return "Engineer [engId=" + engId + ", engName=" + engName + ", engYear=" + engYear + ", engCourse=" + engCourse
				+ ", engDuration=" + engDuration + "]";
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Engineer)
	return this.getEngDuration().equals(((Engineer)obj).getEngDuration());
//			return this.equals(((Engineer)obj));
		else
			return false;
	}
//	
//	void addEngineerObjects(Engineer obj1){
//		
//	}
	
	
}

