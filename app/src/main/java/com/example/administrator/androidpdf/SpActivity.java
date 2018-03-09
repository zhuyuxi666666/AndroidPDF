package com.example.administrator.androidpdf;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class SpActivity extends AppCompatActivity implements View.OnClickListener {
    private Button bendiwenjan, intent_wenjian;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sp_activity);
        bendiwenjan = (Button) findViewById(R.id.bendiwenjian);
        bendiwenjan.setOnClickListener(this);
        intent_wenjian = (Button) findViewById(R.id.intent_wenjian);
        intent_wenjian.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bendiwenjian:
                Intent intent = new Intent(SpActivity.this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.intent_wenjian:
                Intent intent2 = new Intent(SpActivity.this, IntentActivityWenjian.class);
                startActivity(intent2);
                break;
        }

    }
}
