package com.ankur.practice;

public class Triangle {
	private String type;
	private int size;
	
	public Triangle(String type){
		this.type = type;
	}
	
	public int getSize() {
		return size;
	}
	public Triangle(String type,int size){
		this.type = type;
		this.size = size;
	}
	public Triangle(int size){
		this.size =size;
	}
//	public void setSize(String size) {
//		this.size = size;
//	}
	public String getType() {
		return type;
	}
//	public void setType(String type) {
//		this.type = type;// An example of setter injection
//	}
	public void draw(){
		System.out.println(getSize()+" "+getType()+" "+"Traingle drawn");
	}

}
