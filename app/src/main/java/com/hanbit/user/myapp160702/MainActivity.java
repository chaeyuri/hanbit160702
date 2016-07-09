package com.hanbit.user.myapp160702;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hanbit.user.myapp160702.Member.JoinActivity;
import com.hanbit.user.myapp160702.Member.LoginActivity;
import com.hanbit.user.myapp160702.calc.CalcActivity;
import com.hanbit.user.myapp160702.calc.CalendarActivity;
import com.hanbit.user.myapp160702.kaup.KaupActivity;

public class MainActivity extends Activity implements View.OnClickListener{
    // 익스텐드는 온크레이트를 상속
    // 임플리먼트는 클릭리스너를 구현
    Intent intent;
    Button btnCalc, btnCalendar, btnHome, btnIvImage, btnConWeb, btnKaup, btnJoin, btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCalc = (Button) findViewById(R.id.btnCalc);
        btnCalendar = (Button) findViewById(R.id.btnCalendar);
        btnHome = (Button) findViewById(R.id.btnHome);
        btnIvImage = (Button) findViewById(R.id.btnIvImage);
        btnConWeb = (Button) findViewById(R.id.btnConWeb);
        btnKaup = (Button) findViewById(R.id.btnKaup);
        btnJoin = (Button) findViewById(R.id.btnJoin);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        btnCalc.setOnClickListener(this); //여기서 디스는 나에게 라는 뜻임, 나에게 있는 클릭리스너에있는 걸 btnCalc에 넣어라
        btnCalendar.setOnClickListener(this);
        btnIvImage.setOnClickListener(this);
        btnConWeb.setOnClickListener(this);
        btnKaup.setOnClickListener(this);
        btnJoin.setOnClickListener(this);
        btnLogin.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnCalc :
                this.startActivity(new Intent(this,CalcActivity.class)); //디스 뒤에 쉼표!!
                break;

            case R.id.btnCalendar :
                this.startActivity(new Intent(this,CalendarActivity.class));
                break;

            case R.id.btnIvImage :
                this.startActivity(new Intent(this,ImageActivity.class));
                break;

            case R.id.btnConWeb :
                intent = new Intent(intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(intent);
                break;

            case R.id.btnKaup :
                this.startActivity(new Intent(this,KaupActivity.class));
                break;

            case R.id.btnJoin :
                this.startActivity(new Intent(this,JoinActivity.class));
                break;

            case R.id.btnLogin :
                this.startActivity(new Intent(this,LoginActivity.class));
                break;

            default:break;

        }
    }
}
