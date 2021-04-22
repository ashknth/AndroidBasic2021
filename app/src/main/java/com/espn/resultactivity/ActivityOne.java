package com.espn.resultactivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityOne extends AppCompatActivity {

    public Button next_btn;
    public TextView returned_value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

            next_btn = findViewById(R.id.btn_next);
            returned_value = findViewById(R.id.tv_value);

            next_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(ActivityOne.this, ActivityTwo.class);
                    startActivityForResult(intent, 1000);
                }
            });

        }

        @Override
        protected void onActivityResult ( int requestCode, int resultCode, @Nullable Intent data){
            super.onActivityResult(requestCode, resultCode, data);
            if (requestCode == 1000) {
                if (resultCode == Activity.RESULT_OK) {
                    String text = data.getStringExtra("text");
                    returned_value.setText(text);
                }
            }
            super.onActivityResult(resultCode, requestCode, data);
        }
    }