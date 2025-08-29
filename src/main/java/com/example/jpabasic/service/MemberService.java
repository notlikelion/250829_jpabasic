package com.example.jpabasic.service;

import com.example.jpabasic.model.repository.MemberRepository;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    private final MemberRepository memberRepository;

    // 생성자 주입
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
        System.out.println("Service <- Repository 주입 완료!");
    }
}
