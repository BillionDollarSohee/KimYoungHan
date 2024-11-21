package youngHan.core.discount;

import youngHan.core.member.Member;

public interface DiscountPolicy {

    int discount(Member member, int price); // return 할인 금액

}
