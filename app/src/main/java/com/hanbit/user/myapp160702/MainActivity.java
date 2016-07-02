package com.hanbit.user.myapp160702;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{

    Button btnCalc, btnCalendar, btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCalc = (Button) findViewById(R.id.btnCalc);
        btnCalendar = (Button) findViewById(R.id.btnCalendar);
        btnHome = (Button) findViewById(R.id.btnHome);

        btnCalc.setOnClickListener(this); //여기서 디스는 나에게 라는 뜻임, 나에게 있는 클릭리스너에있는 걸 btnCalc에 넣어라
        btnCalendar.setOnClickListener(this);

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

        }
    }
}
