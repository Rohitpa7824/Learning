package com.example.rohit.test7;

/**
 * Created by Rohit on 4/27/2016.
 */

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.Button;
import android.app.Activity;
import android.widget.EditText;

public class top_section_fragment extends Fragment{

    private static EditText topTextInput;
    private static EditText bottomTextInput;

    TopSectionListener activityCommander;

    public interface TopSectionListener{
        public void createMeme(String Top, String Bottom);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try{
            activityCommander = (TopSectionListener) activity;
        }catch(ClassCastException e){
            throw new ClassCastException(activity.toString());
        }
    }

//    @Override
//    public void onAttach(Activity activity) {
//        super.onAttach(activity);
//        try{
//            activityCommander = (TopSectionListener) activity;
//        }catch(ClassCastException e){
//            throw new ClassCastException(activity.toString());
//        }
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View  view = inflater.inflate(R.layout.top_section_fragment,container,false);

        topTextInput = (EditText)view.findViewById(R.id.topTextInput);
        bottomTextInput = (EditText)view.findViewById(R.id.bottomTextInput);
        final Button rvpbutton = (Button) view.findViewById(R.id.rvpbutton);

        rvpbutton.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        buttonClicked(v);
                    }
                }
        );

        return view;
    }

    public void buttonClicked(View view){
        activityCommander.createMeme(topTextInput.getText().toString(), bottomTextInput.getText().toString());
    }
}
