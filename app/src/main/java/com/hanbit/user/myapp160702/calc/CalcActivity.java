package com.hanbit.user.myapp160702.calc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.hanbit.user.myapp160702.MainActivity;
import com.hanbit.user.myapp160702.R;

public class CalcActivity extends Activity implements View.OnClickListener{

    EditText edit1,edit2;
    Button btnPlus, btnMin, btnMul, btnDiv, btnHome;
    int num1, num2;
    TextView txtResult;
    CalcService service = new CalcServiceImpl();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        edit1 = (EditText) findViewById(R.id.edit1);
        edit2 = (EditText) findViewById(R.id.edit2);

        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMin = (Button) findViewById(R.id.btnMin);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnDiv = (Button) findViewById(R.id.btnDiv);

        txtResult = (TextView) findViewById(R.id.txtResult);

        btnHome = (Button) findViewById(R.id.btnHome);

        btnPlus.setOnClickListener(this);
        btnMin.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnHome.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        num1 = Integer.parseInt(edit1.getText().toString());
        num2 = Integer.parseInt(edit2.getText().toString());

        switch(v.getId()){
            case R.id.btnHome:
                this.startActivity(new Intent(this,MainActivity.class));
            break;

            case R.id.btnPlus:
                txtResult.setText("계산 결과 :"+ service.plus(num1,num2));
            break;

            case R.id.btnMin:
                txtResult.setText("계산 결과 :"+ service.minus(num1,num2));
                break;

            case R.id.btnMul:
                txtResult.setText("계산 결과 :"+ service.multi(num1,num2));
                break;

            case R.id.btnDiv:
                txtResult.setText("계산 결과 : 몫 = "+service.divide(num1,num2)+" 나머지 ="+service.remainder(num1,num2));
                break;
            default : break;



        }
    }
}
