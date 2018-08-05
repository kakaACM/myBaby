package com.annotest.bean;

import com.annotest.annotation.Excel;

public class Users {
	@Excel(name = "序号", column = "A")
	private int id;

	@Excel(name = "姓名", column = "B", isExport = true)
	private String name;

	@Excel(name = "年龄", column = "C", prompt = "年龄保密哦!", isExport = false)
	private int age;

	@Excel(name = "班级", column = "D", combo = "clazzCombo", isExport = true)
	private String clazz;

	@Excel(name = "公司", column = "E", isExport = true)
	private String company;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}
