package com.example04;

public class CompositionTest {
public static void main(String[] args) {
    testCreatCourse();
}
    private static void testCreatCourse() {
        Teacher teacher = new Teacher(1001, "BO");
        Course course = new Course("Java", teacher);

        course.setTeacher(teacher);
        System.out.println(course.getName());
        System.out.println(course.getTeacher().getName());
        Student s1 = new Student(001, "小明", true);
        Student s2 = new Student(002, "小华", false);
        Student s3 = new Student(003, "小玉", false);
        Student[] ss = {s1, s2, s3};
        course.setStudents(ss);
        for (Student s : course.getStudents()) {
            System.out.println(s.getLazy());
        }
    }

}