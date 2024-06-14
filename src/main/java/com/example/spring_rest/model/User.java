package com.example.spring_rest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class User{

    @Id
    @GeneratedValue
    private  Long id;

    private String name;

    private  String teamName;

    private  Integer salary;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public User(Long id, String name, String teamName, Integer salary) {
        this.id = id;
        this.name = name;
        this.teamName = teamName;
        this.salary = salary;

    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teamName='" + teamName + '\'' +
                ", salary=" + salary +
                '}';

    }

    public User(){
       super();
    }
}



