package youngHan.core.discount;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import youngHan.core.annotation.MainDiscountPolicy;
import youngHan.core.member.Grade;
import youngHan.core.member.Member;

@Component
@MainDiscountPolicy
//@Primary 를 사용하면 의존 주입시 우선순위를 가지게 되지만 Qualifier 보다는 우선순위가 낮다.
public class RateDiscountPolicy implements DiscountPolicy {

    private int discountPercent = 10;
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP) {
            return price * discountPercent / 100;
        } else {
            return 0;
        }
    }

}
