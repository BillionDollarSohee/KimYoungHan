package youngHan.core;

import youngHan.core.discount.FixDiscountPolicy;
import youngHan.core.member.MemberService;
import youngHan.core.member.MemberServiceImpl;
import youngHan.core.member.MemoryMemberRepository;
import youngHan.core.order.OrderService;
import youngHan.core.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }




}
