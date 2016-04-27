package com.example.rohit.test3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rvpButton = (Button)findViewById(R.id.rvpButton);
        Button rvpButton2 = (Button)findViewById(R.id.rvpButton2);

        rvpButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView rvpText = (TextView)findViewById(R.id.rvpText);
                        rvpText.setText("You clicked the First Button");
                    }
                }
        );

        rvpButton.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        TextView rvpText = (TextView)findViewById(R.id.rvpText);
                        rvpText.setText("You Loooong clicked the First Button");
                        return true;
                    }
                }
        );

        rvpButton2.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView rvpText = (TextView)findViewById(R.id.rvpText);
                        rvpText.setText("You clicked the Second Button");
                    }
                }
        );

        rvpButton2.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        TextView rvpText = (TextView)findViewById(R.id.rvpText);
                        rvpText.setText("You Loooong clicked the Second Button");
                        return false;
                    }
                }
        );
    }
}
