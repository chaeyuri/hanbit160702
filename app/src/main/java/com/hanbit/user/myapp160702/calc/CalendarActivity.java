package com.hanbit.user.myapp160702.calc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hanbit.user.myapp160702.MainActivity;
import com.hanbit.user.myapp160702.R;

public class CalendarActivity extends Activity implements View.OnClickListener {

    Button btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        btnHome = (Button) findViewById(R.id.btnHome);
        btnHome.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnHome:
                this.startActivity(new Intent(this,MainActivity.class));
                break;
        }
    }
}
