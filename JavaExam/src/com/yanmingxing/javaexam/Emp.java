package com.yanmingxing.javaexam;

public class Emp {
private String name;
private String id;
public Emp(String name,String id){
	this.id=id;
	this.name=name;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @return the id
 */
public String getId() {
	return id;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @param id the id to set
 */
public void setId(String id) {
	this.id = id;
}

}
