package com.hanbit.user.myapp160702;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageActivity extends Activity implements View.OnClickListener{

    TextView tvImage;
    ImageView ivImage;
    Button btnPrvImage, btnNextImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        tvImage = (TextView) findViewById(R.id.tvImage);
        ivImage = (ImageView) findViewById(R.id.ivImage);
        btnPrvImage = (Button) findViewById(R.id.btnPrvImage);
        btnNextImage = (Button) findViewById(R.id.btnNextImage);

        btnPrvImage.setOnClickListener(this);
        btnNextImage.setOnClickListener(this);

        btnPrvImage.setVisibility(View.INVISIBLE); //가장 첫장은 이전버튼이 필요없음.
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnNextImage :
                ivImage.setImageResource(R.drawable.koala);
                btnPrvImage.setVisibility(View.VISIBLE);
                btnNextImage.setVisibility(View.INVISIBLE);
                break;

            case R.id.btnPrvImage :
                ivImage.setImageResource(R.drawable.penguins);
                btnNextImage.setVisibility(View.VISIBLE);
                btnPrvImage.setVisibility(View.INVISIBLE);
                break;

        }
    }
}
