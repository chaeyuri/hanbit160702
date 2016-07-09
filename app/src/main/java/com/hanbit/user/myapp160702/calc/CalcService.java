package com.hanbit.user.myapp160702.calc;

/**
 * Created by 1027 on 2016-07-09.
 */
public interface CalcService {
    public int plus(int num1, int num2);
    public int minus(int num1, int num2);
    public int multi(int num1, int num2);
    public int divide(int num1, int num2);          //몫
    public int remainder(int num1, int num2);       //나머지

}
