package com.example.jpabasic.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // 감지해서 테이블이 있는지 체크하고 객체와 연결
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // 헷갈리면 알아서 해주세요...
//    @GeneratedValue(strategy = GenerationType.IDENTITY) - 교안에는 이걸로...
//    @GeneratedValue(strategy = GenerationType.SEQUENCE) - 가장 많이 쓰는 타입
//    @GeneratedValue(strategy = GenerationType.UUID) - 오늘 최종 실습
    private Long id;
    private String name;
}
