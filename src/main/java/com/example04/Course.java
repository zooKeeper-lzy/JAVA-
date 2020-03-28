package com.example04;

public class Course {
    private String name;
    //自定义一个老师类型作为课程的一个属性
    private Teacher teacher;
    private Student[] students;
    public Course(String name,Teacher teacher){
        this.name=name;
        this.teacher=teacher;
    }
    public void setStudents(Student[] students){
        this.students=students;
    }
    public Student[] getStudents(){
        return students;
    }
    public void setTeacher(Teacher teacher){
        this.teacher=teacher;
    }
    public Teacher getTeacher(){
        return teacher;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

}
