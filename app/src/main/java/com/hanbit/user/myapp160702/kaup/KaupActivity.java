package com.hanbit.user.myapp160702.kaup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.hanbit.user.myapp160702.MainActivity;
import com.hanbit.user.myapp160702.R;

public class KaupActivity extends Activity implements View.OnClickListener {
    EditText editName, editHeight, editWeight;
    Button btnResult, btnHome;
    TextView txtResult;
    KaupService service = new KaupServiceImpl();
    KaupBean bean = new KaupBean();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kaup);

        editName = (EditText) findViewById(R.id.editName);
        editHeight = (EditText) findViewById(R.id.editHeight);
        editWeight = (EditText) findViewById(R.id.editWeight);
        btnResult = (Button) findViewById(R.id.btnResult);
        btnHome = (Button) findViewById(R.id.btnHome);
        txtResult = (TextView) findViewById(R.id.txtResult);


        btnResult.setOnClickListener(this);
        btnHome.setOnClickListener(this);

    }

    public void onClick(View v) {
       //  String name = editName.getText().toString();
        // int height = Integer.parseInt(editHeight.getText().toString());
         //int weight = Integer.parseInt(editWeight.getText().toString());
       // Log.d("Name",name);
       // Log.d("Height",String.valueOf(height));
        //Log.d("Weight",String.valueOf(weight));



        bean.setName(editName.getText().toString());
        bean.setHeight(Integer.parseInt(editHeight.getText().toString()));
        bean.setWeight(Integer.parseInt(editWeight.getText().toString()));

       switch (v.getId()){
           case R.id.btnResult:
               String result = service.execute(bean); //그냥 빈 넣으면 오류 서비스에서 봐줘야함(파라메타값)
               txtResult.setText(result);
               break;

           case R.id.btnHome:
               this.startActivity(new Intent(this,MainActivity.class));
               break;

           default: break;
       }
   }

}
