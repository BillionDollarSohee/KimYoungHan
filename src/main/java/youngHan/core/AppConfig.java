package youngHan.core;

import youngHan.core.discount.DiscountPolicy;
import youngHan.core.discount.FixDiscountPolicy;
import youngHan.core.member.MemberRepository;
import youngHan.core.member.MemberService;
import youngHan.core.member.MemberServiceImpl;
import youngHan.core.member.MemoryMemberRepository;
import youngHan.core.order.OrderService;
import youngHan.core.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {

        return new MemberServiceImpl(memberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    private static MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    private static DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }


}
