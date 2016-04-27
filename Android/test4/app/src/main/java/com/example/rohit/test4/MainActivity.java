package com.example.rohit.test4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,GestureDetector.OnDoubleTapListener{

    private TextView rvpmessage;
    private GestureDetectorCompat gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvpmessage = (TextView)findViewById(R.id.rvpmessage);
        this.gestureDetector = new GestureDetectorCompat(this, this);
        gestureDetector.setOnDoubleTapListener(this);
    }

    //Gesture Begins

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        rvpmessage.setText("On Single Tap Confirmed");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        rvpmessage.setText("On Double Tap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        rvpmessage.setText("On Double Tap Event");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        rvpmessage.setText("On Down");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        rvpmessage.setText("On Show Press");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        rvpmessage.setText("On Single Tap up");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        rvpmessage.setText("On Scroll");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        rvpmessage.setText("On lONG pRESS");
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        rvpmessage.setText("On fling");
        return true;
    }

    //Gestures End


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event); 
    }
}
