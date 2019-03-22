package com.mramirez.tarea_labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {
    private TextView tv_shared;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        tv_shared = findViewById(R.id.text_shared);

        Intent mIntent = getIntent();

        if (mIntent!=null) {
            tv_shared.setText(mIntent.getStringExtra(Intent.EXTRA_TEXT));
        }

    }
}
