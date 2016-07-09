package com.hanbit.user.myapp160702;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

public class ContactActivity extends Activity {
    GridView gv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
    }
}
