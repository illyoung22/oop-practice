package org.example.GradeCalculator;

import java.util.List;

public class Courses {
    private final List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double multiCreditAndCourseGrade() {
//        double result = 0;
//        for (Course course: courses) {
//            //result += course.getCredit() * course.getGradeToNumber();
//            result += course.getMultiCreditAndGrade();
//        }

//        return result;
        return courses.stream()
                .mapToDouble(Course::getMultiCreditAndGrade)
                .sum();
    }

    public int calculateTotalCompletedCredit() {
        return courses.stream()
                .mapToInt(Course::getCredit)
                .sum();
    }
}
