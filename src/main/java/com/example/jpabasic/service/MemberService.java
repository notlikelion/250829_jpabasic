package com.example.jpabasic.service;

import com.example.jpabasic.model.entity.Member;
import com.example.jpabasic.model.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor // 이걸로 자동으로 의존성 주입을 해버림
public class MemberService {
    private final MemberRepository memberRepository;

    // 생성자 주입
//    public MemberService(MemberRepository memberRepository) {
//        this.memberRepository = memberRepository;
//        System.out.println("Service <- Repository 주입 완료!");
//        // Getter, Setter가 필요하다
//        Member newMember = new Member();
////        newMember.setId(); // 필요가 없다 -> 왜? -> GenerateValue? 알아서 실행된다
//        newMember.setName("김자바");
//        this.memberRepository.save(newMember);
//    }
}
