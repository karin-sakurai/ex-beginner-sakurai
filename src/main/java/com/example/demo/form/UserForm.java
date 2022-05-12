package com.example.demo.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserForm {
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	@NotBlank(message="名前は必須です")
	private String name;
	
	@NotBlank(message="年齢は必須です")
	private String age;
	
	@NotBlank(message="コメントは必須です")
	@Size(min=1,max=127,message="1~127文字でお願いします")
	private String comment;
	
	@Override
	public String toString() {
		return "UserForm [name=" + name + ", age=" + age + ", comment=" + comment + "]";
	}
	
	
	
	

}
