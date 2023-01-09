package com.techie.springbatchexample.model;

import org.springframework.lang.NonNull;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "batch_user")
public class User {
	@Id
	Integer id;
	String name;
	String dep;
	Long salary;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer id, String name, String dep, Long salary) {
		super();
		this.id = id;
		this.name = name;
		this.dep = dep;
		this.salary = salary;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", dep=" + dep + ", salary=" + salary + "]";
	}
	
	

}
