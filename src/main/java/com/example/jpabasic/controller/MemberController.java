package com.example.jpabasic.controller;

import com.example.jpabasic.model.entity.Member;
import com.example.jpabasic.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/members") // 주소(mapping) - Request, Get, Post...
@RequiredArgsConstructor // 생성자 주입
public class MemberController {
    private final MemberService memberService; // 직접 생성자를 만드셔도 되지만..

    @GetMapping // (/)
    public String list(Model model) {
        model.addAttribute("members", memberService.findMembers());
        // forward. -> 템플릿 데이터를 채운 뒤 -> 그걸 연결 (서버 뒤)
        return "member/list"; // resources/templates/member/list.html (thymeleaf)
    }

    @GetMapping("/new") // 데이터를 추가하는 폼으로 유도
    public String createForm(Model model) {
        // thymeleaf에서 이 member 반영해서 form의 id, name 입력에서 자동 바인딩
        model.addAttribute("member", new Member());
        return "member/addForm"; // ... addForm.html
    }

    @PostMapping("/new") // GET /new -> FORM -> Post -> Redirect -> GET
    public String create(@ModelAttribute Member member) {
        memberService.saveMember(member);
        return "redirect:/members"; // 하나가 추가된 다음에 -> GET -> 모든 데이터를 보여주는...
    }
}
