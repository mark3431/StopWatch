package com.oakhilldigital.stopwatch;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.oakhilldigital.stopwatch.R;


public class EditNamesActivity extends AppCompatActivity {

    Button saveNamesBtn;
    EditText Name1, Name2, Name3, Name4, Name5, Name6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_names);

        Log.i("EditNamesActivity", "Here");


        Name1 = (EditText)findViewById(R.id.Name1);
        Name2 = (EditText)findViewById(R.id.Name2);
        Name3 = (EditText)findViewById(R.id.Name3);
        Name4 = (EditText)findViewById(R.id.Name4);
        Name5 = (EditText)findViewById(R.id.Name5);
        Name6 = (EditText)findViewById(R.id.Name6);

        saveNamesBtn = (Button)findViewById(R.id.saveNames);



        saveNamesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name1, name2, name3, name4, name5, name6;

                name1 = Name1.getText().toString();
                name2 = Name2.getText().toString();
                name3 = Name3.getText().toString();
                name4 = Name4.getText().toString();
                name5 = Name5.getText().toString();
                name6 = Name6.getText().toString();

                Log.i("EditNamesActivity", "Here2");

                finish();
            }
        });

        //finish();



    }
}
