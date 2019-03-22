package com.mramirez.tarea_labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.mramirez.tarea_labo3.Utilities.AppConstants;

public class MainActivity extends AppCompatActivity {

    private EditText ed_user,ed_pass,ed_email,ed_gender;
    private Button btn_send;
    private TextView tv_user,tv_pass,tv_email,tv_gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed_user = findViewById(R.id.et_user);
        ed_pass = findViewById(R.id.ed_password);
        ed_email = findViewById(R.id.ed_email);
        ed_gender= findViewById(R.id.ed_gender);

        tv_user = findViewById(R.id.tv_user);
        tv_pass = findViewById(R.id.tv_pass);
        tv_email = findViewById(R.id.tv_email);
        tv_gender= findViewById(R.id.tv_gender);

        btn_send = findViewById(R.id.btn_send);


        btn_send.setOnClickListener(v->{
            Intent mIntent = new Intent(MainActivity.this,SendActivity.class);
            mIntent.putExtra(AppConstants.TEXT_KEY,ed_user.getText().toString());
            mIntent.putExtra(AppConstants.TEXT_KEY1,ed_pass.getText().toString());
            mIntent.putExtra(AppConstants.TEXT_KEY2,ed_email.getText().toString());
            mIntent.putExtra(AppConstants.TEXT_KEY3,ed_gender.getText().toString());
            startActivity(mIntent);
        });




    }
}
