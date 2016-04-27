package com.example.rohit.test7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements top_section_fragment.TopSectionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //This is called by the top fragment when the user clicks the button
    @Override
    public void createMeme(String Top, String Bottom) {
        bottom_picture_fragment bottomfragment = (bottom_picture_fragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        bottomfragment.setMemeText(Top,Bottom);
    }
}
