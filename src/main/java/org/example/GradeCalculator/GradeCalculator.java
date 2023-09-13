package org.example.GradeCalculator;

import java.util.List;

public class GradeCalculator {
    private final Courses courses;


    public GradeCalculator(List<Course> courses) {
        this.courses = new Courses(courses);
    }

    public double calculateGrade() {
        double result = courses.multiCreditAndCourseGrade();
//        double result = 0;
//        for (Course course: courses) {
//            //result += course.getCredit() * course.getGradeToNumber();
//            result += course.getMultiCreditAndGrade();
//        }

        //수강신청 총 학점 수
       int totalCompleteCredit=  courses.calculateTotalCompletedCredit();
//        int totalCompleteCredit = courses.stream()
//                .mapToInt(Course::getCredit)
//                .sum();
        return result / totalCompleteCredit;
    }
}
