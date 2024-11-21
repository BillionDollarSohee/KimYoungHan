package youngHan.core.order;

import youngHan.core.discount.DiscountPolicy;
import youngHan.core.discount.FixDiscountPolicy;
import youngHan.core.member.Member;
import youngHan.core.member.MemberRepository;
import youngHan.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }

}
