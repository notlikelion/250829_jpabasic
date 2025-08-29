package com.example.jpabasic.model.repository;

import com.example.jpabasic.model.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

// JPARepository -> <엔터티의타입, 엔터티의ID(PK)의타입>
// 제너릭 <> -> 기본 -> Long.
public interface MemberRepository extends JpaRepository<Member, Long> {
}
