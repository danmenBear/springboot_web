package com.mike.pr.model;


public class Classes {

    private String id;

    private String teacher;

    private String name;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Classes(String id, String teacher, String name) {

        this.id = id;
        this.teacher = teacher;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "id='" + id + '\'' +
                ", teacher='" + teacher + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
