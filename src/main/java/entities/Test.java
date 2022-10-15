package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Test implements Serializable{

	@Id
	@GeneratedValue
	private String test;
	
	public Test() {
		// TODO Auto-generated constructor stub
	}
	public Test(String test) {
		this.test = test;
	}
	
	
	
	public String getTestt() {
		return test;
	}
	
	public void setTestt(String test) {
		this.test = test;
	}
}
