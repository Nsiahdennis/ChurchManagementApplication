package com.teamovercomers.Church.Management.Application.service;

import com.teamovercomers.Church.Management.Application.entity.Member;
import com.teamovercomers.Church.Management.Application.repository.MemberRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;
    public List<Member>getAllMembers(){

        return memberRepository.findAll();
    }
    public Member getMemberById(Integer id){

        return   memberRepository.findById(id).orElse(null);
    }
    public Member createMember(Member member){

        return memberRepository.save(member);
    }
    public Member updateMember(Integer id, Member member){
        Member existingMember = memberRepository.findById(Math.toIntExact(id)).orElse(null);

        if (existingMember != null) {
            existingMember.setName(member.getName());
            existingMember.setLocation(member.getLocation());
            existingMember.setEmail(member.getEmail());
            existingMember.setPhoneNumber(member.getPhoneNumber());
            return memberRepository.save(existingMember);
    }
        return null;
}
    public void deleteMember(Integer id){

        memberRepository.deleteById(Math.toIntExact(id));
    }
}