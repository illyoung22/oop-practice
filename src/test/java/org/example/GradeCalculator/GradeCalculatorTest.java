package org.example.GradeCalculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 요구사항
 * 평균학점 계산 방법 = (학점수 * 교과목 평점)의 합계/수강신청 총 학점 수
 * 일급 컬렉션 사용
 */
public class GradeCalculatorTest {
    //핫점 계산기 도메인 : 이수한 과목, 학점 계산기
    //이수한 과목 : 객체지향프로그래밍, 자료구조, 중국어회화 --> 과목(코스) 클래스
    //이수한 과목을 전달하여 평균학점 계산 요청 -> 학점 계산기 -->(학점수 * 교과목 평점)의 합계/수강신청 총 학점 수

    @Test
    @DisplayName("평균학점 계산")
    void calculateGradeTest() {
        List<Course> courseList = List.of(new Course("OOP",3,"A+"), new Course("자료구조",3,"A+"));
        GradeCalculator gradeCalculator = new GradeCalculator(courseList);
        double gradeResult = gradeCalculator.calculateGrade();

        assertThat(gradeResult).isEqualTo(4.5);
    }
}
