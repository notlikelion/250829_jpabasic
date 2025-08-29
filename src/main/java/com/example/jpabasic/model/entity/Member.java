package com.example.jpabasic.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity // 감지해서 테이블이 있는지 체크하고 객체와 연결
//@Getter // .get~
//@Setter // .set~
//@ToString // sout -> 구성요소
//@NoArgsConstructor // 기본 생성자 (패러미터가 없는...)
//@RequiredArgsConstructor // final로 되어 있는 것들을 만들어주는 생성자 entity 용 아님
//@AllArgsConstructor // 모든 프로퍼티
@Data // @Getter, @Setter, @RequiredArgsConstructor, @ToString, @EqualsAndHashCode
@NoArgsConstructor // new Member()
@AllArgsConstructor // new Member(... - 필드들을 직접 만들어서 넣을 때)
// 생성자는 뭔가 직접 정의를 하면 기본 생성자는 비활성화된다 -> 직접 추가해줘야함
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // 헷갈리면 알아서 해주세요...
//    @GeneratedValue(strategy = GenerationType.IDENTITY) - 교안에는 이걸로...
//    @GeneratedValue(strategy = GenerationType.SEQUENCE) - 가장 많이 쓰는 타입
//    @GeneratedValue(strategy = GenerationType.UUID) - 오늘 최종 실습
    private Long id;
    private String name;

    // 생성으로도 만들어줄 수 있는데...
}
