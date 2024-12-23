package vgu.dz.Main;


import vgu.dz.ninth.ninth;
import vgu.dz.tenth.Course;
import vgu.dz.tenth.Solution;
import vgu.dz.tenth.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Course> courses = new ArrayList<>();

        Course course1 = new Course(1);
        course1.addStudent(new Student("Ivan", 4.5));
        course1.addStudent(new Student("Ivan2", 3.7));
        course1.addStudent(new Student("Ivan3", 2.8));
        course1.addStudent(new Student("Ivan4", 3.0));

        Course course2 = new Course(2);
        course2.addStudent(new Student("Ivan5", 3.8));
        course2.addStudent(new Student("Ivan6", 4.0));
        course2.addStudent(new Student("Ivan7", 2.5));
        course2.addStudent(new Student("Ivan8", 3.2));

        courses.add(course1);
        courses.add(course2);

        List <Student> result = Solution.solution(courses, 2, 3);
        for (Student student : result) {
            System.out.println(student.name + " " + student.score);
        }
    }
}

