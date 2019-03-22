package com.mramirez.tarea_labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.mramirez.tarea_labo3.Utilities.AppConstants;

public class SendActivity extends AppCompatActivity {

    private TextView tv_user,tv_pass,tv_email,tv_gender;
    private Button btn_share;
    private String cadena;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);

        tv_user = findViewById(R.id.tv_user);
        tv_pass = findViewById(R.id.tv_pass);
        tv_email = findViewById(R.id.tv_email);
        tv_gender = findViewById(R.id.tv_gender);

        btn_share = findViewById(R.id.btn_share);



        Intent mIntent = getIntent();
        if (mIntent!=null) {
            tv_user.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY));
            tv_pass.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY1));
            tv_email.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY2));
            tv_gender.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY3));
        }

        btn_share.setOnClickListener(v->{
            cadena = (tv_user.getText().toString())+" "+(tv_pass.getText().toString())+" "+(tv_email.getText().toString())+" "+(tv_gender.getText().toString());
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT,cadena);
            startActivity(intent);

        });

    }
}
