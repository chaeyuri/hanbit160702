package com.hanbit.user.myapp160702.Member;

import android.util.Log;

/**
 * Created by 1027 on 2016-07-09.
 */
public class MemberServiceImpl implements MemberService {
    // 조인과 로그인의 값이 공유
    static String sessionID, sessionPW;

    @Override
    public String join(MemberBean bean) {
        String id = bean.getId();
        String pw = bean.getPw();
        String name = bean.getName();
        String mail = bean.getMail();

        Log.d("넘어온 ID :", id);
        Log.d("넘어온 PW :", pw);
        Log.d("넘어온 NAME :", name);
        Log.d("넘어온 MAIL :", mail);

        sessionID = id;
        sessionPW = pw;

        return name+"님 회원가입을 축하드립니다.";
    }

    @Override
    public boolean login(MemberBean bean) {
        boolean loginOK = false;
        String id = bean.getId();
        String pw = bean.getPw();

        Log.d("로그인 ID :", id);
        Log.d("로그인 PW :", pw);
        Log.d("session ID :", sessionID);
        Log.d("session PW :", sessionPW);

        if(sessionID.equals(id) && sessionPW.equals(pw)){
            loginOK = true;
        }
        return loginOK;


    }
}
