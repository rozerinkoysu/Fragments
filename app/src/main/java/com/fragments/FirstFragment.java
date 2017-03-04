package com.fragments;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import static com.fragments.MainActivity.getExtraMessage;

/**
 * Created by rozerin on 26.02.2017.
 */

public class FirstFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View firstFragmentView = inflater.inflate(R.layout.fragment_first, container, false);



        String msg =getArguments().getString("value");
        Log.e("dd", "onCreateView: ");
        TextView txt = (TextView) firstFragmentView.findViewById(R.id.fragment_first_textview);
        txt.setText(msg);
        return firstFragmentView;
    }

//    public void pressAndSend(View v) {
//        Button myButton = (Button) v.findViewById(R.id.fragment_first_button1);
////        EditText myEditText = (EditText) v.findViewById(R.id.fragment_first_edittext);
////        myString = myEditText.getText().toString();
//        ((MainActivity) getExtraMessage()).setExtraMessage("vvv");
//
//    }
}
