package org.example.FoodOrder;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * 음식점에서 음식 주문하는 과정 구현
 * 요구사항
 * 1. 도메인 구성하는 객체에는 어떤 것들이 있는지 고민
 *    ㄴ 손님, 메뉴판, 요리사, 요리
 * 2. 객체들 간의 관계 고민
 *    ㄴ 손님 -- 메뉴판
 *    ㄴ 손님 -- 요리사
 *    ㄴ 요리사 -- 요리
 * 3. 동적인 객체를 정적인 타입으로 추상화해서 도메인 모델링 하기
 *     ㄴ 손님 -- 손님 타입
 *     ㄴ 돈까스/냉염 -- 요리 타입
 *     ㄴ 메뉴판  -- 메뉴타입
 *     ㄴ 메뉴   -- 메뉴
 * 4. 협력을 설계
 * 5. 객체들을 포괄하는 타입에 적절한 책임 할당
 * 6. 구현
 */
public class CustomerTest {
    @Test
    @DisplayName("메뉴 이름에 해당하는 요리를 주문한다.")
    void orderTest() {
        Customer customer = new Customer();
        Menu menu = new Menu(List.of(new MenuItem("돈까스",5000), new MenuItem("냉면",7000)));
        Cooking cooking = new Cooking();
        Assertions.assertThatCode(()-> customer.order("돈까스", menu, cooking))
                .doesNotThrowAnyException();
    }
}
