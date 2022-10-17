package com.codestates.section2week4.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberService {

    private final MemberRepository memberRepository;
    //생성자를 통해 의존관계 주입
    @Autowired
    public MemberService(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    public void createMember(Member member) {
        memberRepository.postMember(member);
    }
    public Member getMember(Long memberId) {
        return memberRepository.getMember(memberId);
    }
    public void deleteMember(Long memberId) {
        memberRepository.deleteMember(memberId);
    }
}
