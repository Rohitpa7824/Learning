package com.example.rohit.test7;

/**
 * Created by Rohit on 4/27/2016.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.TextView;

public class bottom_picture_fragment extends Fragment{

    private static TextView topTextMeme;
    private static TextView bottomTextMeme;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View  view = inflater.inflate(R.layout.bottom_picture_fragment,container,false);
        topTextMeme = (TextView)view.findViewById(R.id.topTextMeme);
        bottomTextMeme = (TextView) view.findViewById(R.id.bottomTextMeme);
        return view;
    }

    public void setMemeText(String top, String bottom)
    {
        topTextMeme.setText(top);
        bottomTextMeme.setText(bottom);
    }

}
