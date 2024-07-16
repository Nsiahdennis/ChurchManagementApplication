package com.teamovercomers.Church.Management.Application.Controllers;

import com.teamovercomers.Church.Management.Application.entity.Church;
import com.teamovercomers.Church.Management.Application.entity.Member;
import com.teamovercomers.Church.Management.Application.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Members")
public class Member_Controller {
    @Autowired

    private MemberService memberService;

    @GetMapping
    public List<Member> getAllMembers() {
        return memberService.getAllMembers();

    }

    @GetMapping("/{id}")
    public Member getMemberById(@PathVariable Integer id) {
        return memberService.getMemberById(id);
    }

    @PostMapping
    public Member createChurch(@RequestBody Member member) {
        return memberService.createMember(member);
    }

    @PutMapping("/{id}")
    public Member updateMember(@PathVariable Integer id, @RequestBody Member member) {
        return memberService.updateMember(id, member);
    }

    @DeleteMapping("/{id}")
    public Church DeleteChurch(@PathVariable Integer id) {
        memberService.deleteMember(id);
        return null;
    }
}
