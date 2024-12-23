package vgu.dz.tenth;

import java.util.ArrayList;
import java.util.List;

public class Course {
    int course;
    List<Student> students;
    public Course(int course) {
        this.course = course;
        this.students = new ArrayList<Student>();
    }
    public void addStudent(Student student) {
        this.students.add(student);
    }
    public List<Student> getStudents() {
        return this.students;
    }
}
