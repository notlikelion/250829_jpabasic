package com.example.jpabasic.model.repository;

import com.example.jpabasic.model.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

// JPARepository -> <엔터티의타입, 엔터티의ID(PK)의타입>
// 제너릭 <> -> 기본 -> Long.
// 컴포넌트 @...? @Repository
// JpaRepository -> Extends만 해도 Scan이 된다
public interface MemberRepository extends JpaRepository<Member, Long> {
}
