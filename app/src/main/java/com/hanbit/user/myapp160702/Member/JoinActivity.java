package com.hanbit.user.myapp160702.Member;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.hanbit.user.myapp160702.MainActivity;
import com.hanbit.user.myapp160702.R;

public class JoinActivity extends Activity implements View.OnClickListener  {

    EditText editID, editPw, editName, editMail;
    Button btnJoin, btnHome;
    TextView tvResult;
    MemberBean bean = new MemberBean();
    MemberService service = new MemberServiceImpl();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);
        editID = (EditText) findViewById(R.id.editID);
        editPw = (EditText) findViewById(R.id.editPw);
        editName = (EditText) findViewById(R.id.editName);
        editMail = (EditText) findViewById(R.id.editMail);
        btnJoin = (Button) findViewById(R.id.btnJoin);
        btnHome = (Button) findViewById(R.id.btnHome);
        tvResult = (TextView) findViewById(R.id.tvResult);

        btnJoin.setOnClickListener(this);
        btnHome.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String id = editID.getText().toString();
        String pw = editPw.getText().toString();
        String name = editName.getText().toString();
        String mail = editMail.getText().toString();
        bean.setId(id);
        bean.setPw(pw);
        bean.setName(name);
        bean.setMail(mail);

        switch (v.getId()){
            case R.id.btnJoin :
                String result = service.join(bean);
                tvResult.setText(result);
                break;

            case R.id.btnHome:
                this.startActivity(new Intent(this,MainActivity.class));
                break;
            default:break;

        }
    }
}
