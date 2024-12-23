package vgu.dz.tenth;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public static List<Student> solution(List<Course> courses, int N, double X) {
        List<Student> result = new ArrayList<Student>();
        for (Course course : courses) {
            List<Student> students = course.getStudents();
            students.sort(Comparator.comparingDouble(student -> student.score));
            int numOfSurvivalStudents = students.size() - N;
            if (numOfSurvivalStudents > 0) {
                int k = 1;
                for (Student student : students) {
                    if (student.score < X && k < N) {
                        k++;
                    }
                    else{
                        result.add(student);
                    }
                }
            }
            else continue;
        }
        return result;
    }
}
