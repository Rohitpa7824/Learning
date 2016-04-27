package com.example.rohit.test5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rvpbutton = (Button)findViewById(R.id.rvpButton);

        rvpbutton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){

                    }
                }
        );
    }
}
