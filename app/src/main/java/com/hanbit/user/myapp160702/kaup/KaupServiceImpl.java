package com.hanbit.user.myapp160702.kaup;

/**
 * Created by 1027 on 2016-07-09.
 */
public class KaupServiceImpl implements KaupService {

    @Override
    public String execute(KaupBean bean) {
        int weight=bean.getWeight(), height=(bean.getHeight())*1000;
        int index = (weight/(height*height))*10; //단위가 그램이라서 1000*10
        String result = "";
        String name = bean.getName();

        if(index >=20){
            result="비만";
        }else if(index>=18){
            result="과체중";
        }else if(index>=15){
            result="정상";
        }else if(index>=13){
            result="저체중";
        }else{
            result="극심한 저체중";
        }

        return name+":"+result;
    }
}
