package com.spring.core.basic.oop.discount;

//정액 할인 정책
//역할 : VIP회원에게만 고정된 할인액을 적용해준다.

import com.spring.core.basic.oop.member.Grade;
import com.spring.core.basic.oop.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

    //고정 할인액
    private static final int FIX_AMOUNT = 3000; //3000원 할인

    @Override
    public int discount(Member member, int itemPrice) {
        if (member.getGrade() == Grade.VIP) {
            return FIX_AMOUNT;
        } else {
            return 0;
        }
    }
}
