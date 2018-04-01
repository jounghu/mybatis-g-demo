package com.edu.sdju.jounghu.mybatisgdemo.domain;

public class Student {
    /**
     * t_student.id;
     */
    private Integer id;

    /**
     * t_student.name;
     */
    private String name;

    /**
     * t_student.t_id;
     */
    private Integer tId;

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
        this.name = name == null ? null : name.trim();
    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tId=" + tId +
                '}';
    }
}