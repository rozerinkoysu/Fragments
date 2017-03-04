package com.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

//import static com.fragments.MainActivity.EXTRA_MESSAGE;

/**
 * Created by rozerin on 26.02.2017.
 */

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        setContentView(R.layout.activity_second);

//        Intent intent = getIntent(); // diğer intent ile aynı isimde oluşturmak zorudna değilim ama nasıl algılıyo o intent olduğunu
//                                    // sorunun cevabı getıntent metodunda çuku sana nyhollnana bir intentvar zaten onu alıyosun
//        String mesaj = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
//
//        TextView secondText = (TextView) findViewById(R.id.activity_second_set_text) ;
//        secondText.setText(mesaj);


        //Bundle bundle = getIntent().getExtras();(
        //bundle.getInt("age");
        //SecondText.setText(bundle.getString("name"));

        super.onCreate(savedInstanceState);
    }


}

