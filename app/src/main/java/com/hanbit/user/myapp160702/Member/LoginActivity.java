package com.hanbit.user.myapp160702.Member;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.hanbit.user.myapp160702.MainActivity;
import com.hanbit.user.myapp160702.R;

public class LoginActivity extends Activity implements View.OnClickListener{

    EditText editID, editPw;
    Button btnLogin, btnHome;
    MemberBean bean = new MemberBean();
    MemberService service = new MemberServiceImpl();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editID = (EditText) findViewById(R.id.editID);
        editPw = (EditText) findViewById(R.id.editPw);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnHome = (Button) findViewById(R.id.btnHome);

        btnLogin.setOnClickListener(this);
        btnHome.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String id = editID.getText().toString();
        String pw = editPw.getText().toString();
        bean.setId(id);
        bean.setPw(pw);

        switch (v.getId()){
            case R.id.btnLogin :
                if(service.login(bean)){
                    Toast tos = Toast.makeText(LoginActivity.this, "로그인성공",Toast.LENGTH_LONG);
                    tos.show();
                }else{
                    Toast tos = Toast.makeText(LoginActivity.this, "로그인실패",Toast.LENGTH_SHORT);
                    tos.show();
                }
                break;

            case R.id.btnHome:
                this.startActivity(new Intent(this,MainActivity.class));
                break;
            default:break;


        }
    }

}
