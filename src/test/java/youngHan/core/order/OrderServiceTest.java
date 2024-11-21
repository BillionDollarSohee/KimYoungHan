package youngHan.core.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import youngHan.core.member.Grade;
import youngHan.core.member.Member;
import youngHan.core.member.MemberService;
import youngHan.core.member.MemberServiceImpl;

public class OrderServiceTest {

    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder() {
        //given
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);

        //when
        memberService.join(member);
        Order order = orderService.createOrder(memberId, "itemA", 10000);

        //then
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }

}
