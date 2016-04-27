package com.example.rohit.test6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.graphics.Color;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RelativeLayout rvpLayout = (RelativeLayout)findViewById(R.id.rvpLayout);
        final Button rvpButton = (Button)findViewById(R.id.rvpbutton);

        //final String[] mystring = {"Color.BLUE", "Color.BLACK","Color.RED"};

        rvpButton.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        if(globals.i == 0) {
                            rvpLayout.setBackgroundColor(Color.BLUE);
                            rvpButton.setBackgroundColor(Color.RED);
                        }
                        else if(globals.i == 1){
                            rvpLayout.setBackgroundColor(Color.RED);
                            rvpButton.setBackgroundColor(Color.YELLOW);
                        }
                        else if(globals.i == 2){
                            rvpLayout.setBackgroundColor(Color.YELLOW);
                            rvpButton.setBackgroundColor(Color.GREEN);
                        }
                        else if(globals.i == 3){
                            rvpLayout.setBackgroundColor(Color.GREEN);
                            rvpButton.setBackgroundColor(Color.MAGENTA);
                        }
                        else if(globals.i == 4){
                            rvpLayout.setBackgroundColor(Color.MAGENTA);
                            rvpButton.setBackgroundColor(Color.LTGRAY);
                        }
                        else if(globals.i == 5) {
                            rvpLayout.setBackgroundColor(Color.LTGRAY);
                            rvpButton.setBackgroundColor(Color.BLUE);
                        }
                        globals.i++;
                        if(globals.i == 6)
                            globals.i = 0;
                    }
                }
        );
    }
}
