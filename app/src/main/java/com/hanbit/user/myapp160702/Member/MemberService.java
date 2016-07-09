package com.hanbit.user.myapp160702.Member;

/**
 * Created by 1027 on 2016-07-09.
 */
public interface MemberService {
    public String join(MemberBean bean); // 인터페이스는 꾸불괄호 못씀 -추상메소드
    public boolean login(MemberBean bean);
}
