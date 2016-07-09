package com.hanbit.user.myapp160702.calc;

import com.hanbit.user.myapp160702.calc.CalcService;

/**
 * Created by 1027 on 2016-07-09.
 */
public class CalcServiceImpl implements CalcService {
    @Override
    public int plus(int num1, int num2) {
        return num1+num2;
    }

    @Override
    public int minus(int num1, int num2) {
        return num1-num2;
    }

    @Override
    public int multi(int num1, int num2) {
        return num1*num2;
    }

    @Override
    public int divide(int num1, int num2) {
        return num1/num2;
    }

    @Override
    public int remainder(int num1, int num2) {
        return num1%num2;
    }
}
