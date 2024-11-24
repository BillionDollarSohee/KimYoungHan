package youngHan.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import youngHan.core.discount.DiscountPolicy;
import youngHan.core.discount.RateDiscountPolicy;
import youngHan.core.member.MemberRepository;
import youngHan.core.member.MemberService;
import youngHan.core.member.MemberServiceImpl;
import youngHan.core.member.MemoryMemberRepository;
import youngHan.core.order.OrderService;
import youngHan.core.order.OrderServiceImpl;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public static MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public static DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }

}
