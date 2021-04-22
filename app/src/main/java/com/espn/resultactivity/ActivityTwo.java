package com.espn.resultactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityTwo extends AppCompatActivity {
    public EditText user_value;
    public Button done_btn;
    public String u_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        user_value=findViewById(R.id.tv_done);
        done_btn = findViewById(R.id.btn_done);
        done_btn.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View view)
                {
                    u_text= user_value.getText().toString();
                    Intent intent= new Intent();
                    intent.putExtra("text",u_text);
                    setResult(Activity.RESULT_OK,intent);
                    finish();
                }
            });
        }
    }