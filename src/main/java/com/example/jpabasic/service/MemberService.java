package com.example.jpabasic.service;

import com.example.jpabasic.model.entity.Member;
import com.example.jpabasic.model.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor // 이걸로 자동으로 의존성 주입을 해버림
@Transactional(readOnly = true) // 읽어들여오기 때문에 기본적으로는 transaction x.
// 성능 최적화
public class MemberService {
    private final MemberRepository memberRepository; // DB

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

    // CRUD : Create(Insert), Read(Select), Update, Delete (SQL DML)
    // 읽기, 쓰기

    @Transactional // 쓰기 작업을 할 때 중간에 오류 발생 시 롤백.
    public Member saveMember(Member member) {
        // 해당 명세에 맞는(Entity로 지정된) 데이터를 넣으면
        // 존재하는 id를 갖고 있으면 대체해서 저장
        // 없는(id가 없는) 새롭게 저장. (upsert - update, insert)
        return memberRepository.save(member);
        // member -> controller -> ?
    }

    // 읽기 전용으로 최적화
    public List<Member> findMembers() {
        // 다 찾아준다. SELECT * FROM MEMBER;
        return memberRepository.findAll();
    }
}
