package com.ram.unittestdatajpa.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name = "users")
public class Users {

	@Id
	private Integer id;
	private String name;
	private Integer salary;
	private Integer teamName;
	
	public Users() {}

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

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Integer getTeamName() {
		return teamName;
	}

	public void setTeamName(Integer teamName) {
		this.teamName = teamName;
	}
	
	
}
