package com.fragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    private static String EXTRA_MESSAGE = "org.kodluyoruz.MESAJ";

    public static String getExtraMessage() {
        return EXTRA_MESSAGE;
    }

    public void setExtraMessage(String EXTRA_MESSAGE) {
        this.EXTRA_MESSAGE = EXTRA_MESSAGE; // mainactivity içindeki activity stringi privsate değere atıyor.
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        FragmentManager fragmentManager = getFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//
//       Fragment  firstFragment = new FirstFragment();
//        fragmentTransaction.add(R.id.activity_main_firstfragment, firstFragment);
//        fragmentTransaction.commit();

//
//        TextView myText = (TextView) findViewById(R.id.activity_main_textview);


    }

    public void sendText(View View) {
        EditText editText = (EditText) View.findViewById(R.id.activity_main_editText);
        String messages = editText.getText().toString();
        Button btn = (Button) findViewById(R.id.activity_main_btn);
        Bundle bundle = new Bundle();
        bundle.putString("value", messages);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment fragInfo = new Fragment();
        fragInfo.setArguments(bundle);
        fragmentTransaction.replace(R.id.fragment_first, fragInfo);
        fragmentTransaction.commit();

    }
//        Intent intent = new Intent(this, SecondActivity.class);
//        EditText editText = (EditText) findViewById(R.id.activity_main_editText);
//        String mesaj = editText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE,mesaj);
//        startActivity(intent);
//        finish();

 //   Intent intent = new Intent(this, SecondActivity.class);
///         int age ;
    //         String name ;
//        intent.putExtra(age,"27");
    //        intent.putExtra(name,"Roz");


    }





