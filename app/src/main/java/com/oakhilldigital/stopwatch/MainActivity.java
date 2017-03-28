package com.oakhilldigital.stopwatch;

import android.os.SystemClock;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
import android.util.Log;
import android.view.MenuInflater;
import android.view.Menu;
import android.view.MenuItem;

import com.oakhilldigital.stopwatch.R;


public class MainActivity extends AppCompatActivity {
    Button pauseAllBtn, resetAllBtn, saveAllBtn, startAllBtn;
    Chronometer chronometer1, chronometer2, chronometer3, chronometer4, chronometer5, chronometer6, chronometer7, chronometer8, chronometer9, chronometer10, chronometer11, chronometer12, chronometer13, chronometer14, chronometer15, chronometer16;
    ImageButton startBtn1, startBtn2, startBtn3, startBtn4, startBtn5, startBtn6, startBtn7, startBtn8, startBtn9, startBtn10, startBtn11, startBtn12, startBtn13, startBtn14, startBtn15, startBtn16;
    ImageButton pauseBtn1, pauseBtn2, pauseBtn3, pauseBtn4, pauseBtn5, pauseBtn6, pauseBtn7, pauseBtn8, pauseBtn9, pauseBtn10, pauseBtn11, pauseBtn12, pauseBtn13, pauseBtn14, pauseBtn15, pauseBtn16;
    ImageButton resetBtn1, resetBtn2, resetBtn3, resetBtn4, resetBtn5, resetBtn6, resetBtn7, resetBtn8, resetBtn9, resetBtn10, resetBtn11, resetBtn12, resetBtn13, resetBtn14, resetBtn15, resetBtn16;
    EditText Name1, Name2, Name3, Name4, Name5, Name6, Name7, Name8, Name9, Name10, Name11, Name12, Name13, Name14, Name15, Name16;
    long stopTime1 = 0, stopTime2 = 0, stopTime3 = 0, stopTime4 = 0, stopTime5 = 0, stopTime6 = 0, stopTime7 = 0, stopTime8 = 0, stopTime9 = 0, stopTime10 = 0, stopTime11 = 0, stopTime12 = 0, stopTime13 = 0, stopTime14 = 0, stopTime15 = 0, stopTime16 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        pauseAllBtn = (Button)findViewById(R.id.pauseAll);
        resetAllBtn = (Button)findViewById(R.id.resetAll);
        saveAllBtn = (Button)findViewById(R.id.saveAll);
        startAllBtn = (Button)findViewById(R.id.startAll);

        startAllBtn.setVisibility(View.VISIBLE);
        pauseAllBtn.setVisibility(View.GONE);
        saveAllBtn.setVisibility(View.GONE);
        resetAllBtn.setVisibility(View.VISIBLE);


        chronometer1 = (Chronometer)findViewById(R.id.chronometer1);
        chronometer2 = (Chronometer)findViewById(R.id.chronometer2);
        chronometer3 = (Chronometer)findViewById(R.id.chronometer3);
        chronometer4 = (Chronometer)findViewById(R.id.chronometer4);
        chronometer5 = (Chronometer)findViewById(R.id.chronometer5);
        chronometer6 = (Chronometer)findViewById(R.id.chronometer6);
        chronometer7 = (Chronometer)findViewById(R.id.chronometer7);
        chronometer8 = (Chronometer)findViewById(R.id.chronometer8);
        chronometer9 = (Chronometer)findViewById(R.id.chronometer9);
        chronometer10 = (Chronometer)findViewById(R.id.chronometer10);
        chronometer11 = (Chronometer)findViewById(R.id.chronometer11);
        chronometer12 = (Chronometer)findViewById(R.id.chronometer12);
        chronometer13 = (Chronometer)findViewById(R.id.chronometer13);
        chronometer14 = (Chronometer)findViewById(R.id.chronometer14);
        chronometer15 = (Chronometer)findViewById(R.id.chronometer15);
        chronometer16 = (Chronometer)findViewById(R.id.chronometer16);

        startBtn1 = (ImageButton)findViewById(R.id.start1);
        startBtn2 = (ImageButton)findViewById(R.id.start2);
        startBtn3 = (ImageButton)findViewById(R.id.start3);
        startBtn4 = (ImageButton)findViewById(R.id.start4);
        startBtn5 = (ImageButton)findViewById(R.id.start5);
        startBtn6 = (ImageButton)findViewById(R.id.start6);
        startBtn7 = (ImageButton)findViewById(R.id.start7);
        startBtn8 = (ImageButton)findViewById(R.id.start8);
        startBtn9 = (ImageButton)findViewById(R.id.start9);
        startBtn10 = (ImageButton)findViewById(R.id.start10);
        startBtn11 = (ImageButton)findViewById(R.id.start11);
        startBtn12 = (ImageButton)findViewById(R.id.start12);
        startBtn13 = (ImageButton)findViewById(R.id.start13);
        startBtn14 = (ImageButton)findViewById(R.id.start14);
        startBtn15 = (ImageButton)findViewById(R.id.start15);
        startBtn16 = (ImageButton)findViewById(R.id.start16);

        pauseBtn1 = (ImageButton)findViewById(R.id.pause1);
        pauseBtn2 = (ImageButton)findViewById(R.id.pause2);
        pauseBtn3 = (ImageButton)findViewById(R.id.pause3);
        pauseBtn4 = (ImageButton)findViewById(R.id.pause4);
        pauseBtn5 = (ImageButton)findViewById(R.id.pause5);
        pauseBtn6 = (ImageButton)findViewById(R.id.pause6);
        pauseBtn7 = (ImageButton)findViewById(R.id.pause7);
        pauseBtn8 = (ImageButton)findViewById(R.id.pause8);
        pauseBtn9 = (ImageButton)findViewById(R.id.pause9);
        pauseBtn10 = (ImageButton)findViewById(R.id.pause10);
        pauseBtn11 = (ImageButton)findViewById(R.id.pause11);
        pauseBtn12 = (ImageButton)findViewById(R.id.pause12);
        pauseBtn13 = (ImageButton)findViewById(R.id.pause13);
        pauseBtn14 = (ImageButton)findViewById(R.id.pause14);
        pauseBtn15 = (ImageButton)findViewById(R.id.pause15);
        pauseBtn16 = (ImageButton)findViewById(R.id.pause16);


        resetBtn1 = (ImageButton)findViewById(R.id.reset1);
        resetBtn2 = (ImageButton)findViewById(R.id.reset2);
        resetBtn3 = (ImageButton)findViewById(R.id.reset3);
        resetBtn4 = (ImageButton)findViewById(R.id.reset4);
        resetBtn5 = (ImageButton)findViewById(R.id.reset5);
        resetBtn6 = (ImageButton)findViewById(R.id.reset6);
        resetBtn7 = (ImageButton)findViewById(R.id.reset7);
        resetBtn8 = (ImageButton)findViewById(R.id.reset8);
        resetBtn9 = (ImageButton)findViewById(R.id.reset9);
        resetBtn10 = (ImageButton)findViewById(R.id.reset10);
        resetBtn11 = (ImageButton)findViewById(R.id.reset11);
        resetBtn12 = (ImageButton)findViewById(R.id.reset12);
        resetBtn13 = (ImageButton)findViewById(R.id.reset13);
        resetBtn14 = (ImageButton)findViewById(R.id.reset14);
        resetBtn15 = (ImageButton)findViewById(R.id.reset15);
        resetBtn16 = (ImageButton)findViewById(R.id.reset16);


        Name1 = (EditText)findViewById(R.id.Name1);
        Name2 = (EditText)findViewById(R.id.Name2);
        Name3 = (EditText)findViewById(R.id.Name3);
        Name4 = (EditText)findViewById(R.id.Name4);
        Name5 = (EditText)findViewById(R.id.Name5);
        Name6 = (EditText)findViewById(R.id.Name6);
        Name7 = (EditText)findViewById(R.id.Name7);
        Name8 = (EditText)findViewById(R.id.Name8);
        Name9 = (EditText)findViewById(R.id.Name9);
        Name10 = (EditText)findViewById(R.id.Name10);
        Name11 = (EditText)findViewById(R.id.Name11);
        Name12 = (EditText)findViewById(R.id.Name12);
        Name13 = (EditText)findViewById(R.id.Name13);
        Name14 = (EditText)findViewById(R.id.Name14);
        Name15 = (EditText)findViewById(R.id.Name15);
        Name16 = (EditText)findViewById(R.id.Name16);




        //***************************************************************************
        // Start buttons
        startBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer1.setBase(SystemClock.elapsedRealtime() + stopTime1);
                chronometer1.start();
                startBtn1.setVisibility(View.GONE);
                pauseBtn1.setVisibility(View.VISIBLE);

                startAllBtn.setVisibility(View.GONE);
                pauseAllBtn.setVisibility(View.VISIBLE);
                saveAllBtn.setVisibility(View.GONE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });

        startBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer2.setBase(SystemClock.elapsedRealtime() + stopTime2);
                chronometer2.start();
                startBtn2.setVisibility(View.GONE);
                pauseBtn2.setVisibility(View.VISIBLE);

                startAllBtn.setVisibility(View.GONE);
                pauseAllBtn.setVisibility(View.VISIBLE);
                saveAllBtn.setVisibility(View.GONE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });

        startBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer3.setBase(SystemClock.elapsedRealtime() + stopTime3);
                chronometer3.start();
                startBtn3.setVisibility(View.GONE);
                pauseBtn3.setVisibility(View.VISIBLE);

                startAllBtn.setVisibility(View.GONE);
                pauseAllBtn.setVisibility(View.VISIBLE);
                saveAllBtn.setVisibility(View.GONE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });

        startBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer4.setBase(SystemClock.elapsedRealtime() + stopTime4);
                chronometer4.start();
                startBtn4.setVisibility(View.GONE);
                pauseBtn4.setVisibility(View.VISIBLE);

                startAllBtn.setVisibility(View.GONE);
                pauseAllBtn.setVisibility(View.VISIBLE);
                saveAllBtn.setVisibility(View.GONE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });

        startBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer5.setBase(SystemClock.elapsedRealtime() + stopTime5);
                chronometer5.start();
                startBtn5.setVisibility(View.GONE);
                pauseBtn5.setVisibility(View.VISIBLE);

                startAllBtn.setVisibility(View.GONE);
                pauseAllBtn.setVisibility(View.VISIBLE);
                saveAllBtn.setVisibility(View.GONE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });


        startBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer6.setBase(SystemClock.elapsedRealtime() + stopTime6);
                chronometer6.start();
                startBtn6.setVisibility(View.GONE);
                pauseBtn6.setVisibility(View.VISIBLE);

                startAllBtn.setVisibility(View.GONE);
                pauseAllBtn.setVisibility(View.VISIBLE);
                saveAllBtn.setVisibility(View.GONE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });

        startBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer7.setBase(SystemClock.elapsedRealtime() + stopTime7);
                chronometer7.start();
                startBtn7.setVisibility(View.GONE);
                pauseBtn7.setVisibility(View.VISIBLE);

                startAllBtn.setVisibility(View.GONE);
                pauseAllBtn.setVisibility(View.VISIBLE);
                saveAllBtn.setVisibility(View.GONE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });


        startBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer8.setBase(SystemClock.elapsedRealtime() + stopTime8);
                chronometer8.start();
                startBtn8.setVisibility(View.GONE);
                pauseBtn8.setVisibility(View.VISIBLE);

                startAllBtn.setVisibility(View.GONE);
                pauseAllBtn.setVisibility(View.VISIBLE);
                saveAllBtn.setVisibility(View.GONE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });


        startBtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer9.setBase(SystemClock.elapsedRealtime() + stopTime9);
                chronometer9.start();
                startBtn9.setVisibility(View.GONE);
                pauseBtn9.setVisibility(View.VISIBLE);

                startAllBtn.setVisibility(View.GONE);
                pauseAllBtn.setVisibility(View.VISIBLE);
                saveAllBtn.setVisibility(View.GONE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });


        startBtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer10.setBase(SystemClock.elapsedRealtime() + stopTime10);
                chronometer10.start();
                startBtn10.setVisibility(View.GONE);
                pauseBtn10.setVisibility(View.VISIBLE);

                startAllBtn.setVisibility(View.GONE);
                pauseAllBtn.setVisibility(View.VISIBLE);
                saveAllBtn.setVisibility(View.GONE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });


        startBtn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer11.setBase(SystemClock.elapsedRealtime() + stopTime11);
                chronometer11.start();
                startBtn11.setVisibility(View.GONE);
                pauseBtn11.setVisibility(View.VISIBLE);

                startAllBtn.setVisibility(View.GONE);
                pauseAllBtn.setVisibility(View.VISIBLE);
                saveAllBtn.setVisibility(View.GONE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });



        startBtn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer12.setBase(SystemClock.elapsedRealtime() + stopTime12);
                chronometer12.start();
                startBtn12.setVisibility(View.GONE);
                pauseBtn12.setVisibility(View.VISIBLE);

                startAllBtn.setVisibility(View.GONE);
                pauseAllBtn.setVisibility(View.VISIBLE);
                saveAllBtn.setVisibility(View.GONE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });


        startBtn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer13.setBase(SystemClock.elapsedRealtime() + stopTime13);
                chronometer13.start();
                startBtn13.setVisibility(View.GONE);
                pauseBtn13.setVisibility(View.VISIBLE);

                startAllBtn.setVisibility(View.GONE);
                pauseAllBtn.setVisibility(View.VISIBLE);
                saveAllBtn.setVisibility(View.GONE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });


        startBtn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer14.setBase(SystemClock.elapsedRealtime() + stopTime14);
                chronometer14.start();
                startBtn14.setVisibility(View.GONE);
                pauseBtn14.setVisibility(View.VISIBLE);

                startAllBtn.setVisibility(View.GONE);
                pauseAllBtn.setVisibility(View.VISIBLE);
                saveAllBtn.setVisibility(View.GONE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });


        startBtn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer15.setBase(SystemClock.elapsedRealtime() + stopTime15);
                chronometer15.start();
                startBtn15.setVisibility(View.GONE);
                pauseBtn15.setVisibility(View.VISIBLE);

                startAllBtn.setVisibility(View.GONE);
                pauseAllBtn.setVisibility(View.VISIBLE);
                saveAllBtn.setVisibility(View.GONE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });


        startBtn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer16.setBase(SystemClock.elapsedRealtime() + stopTime16);
                chronometer16.start();
                startBtn16.setVisibility(View.GONE);
                pauseBtn16.setVisibility(View.VISIBLE);

                startAllBtn.setVisibility(View.GONE);
                pauseAllBtn.setVisibility(View.VISIBLE);
                saveAllBtn.setVisibility(View.GONE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });



        //***************************************************************************
        // Pause buttons
        pauseBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTime1 = chronometer1.getBase() - SystemClock.elapsedRealtime();
                chronometer1.stop();
                startBtn1.setVisibility(View.VISIBLE);
                pauseBtn1.setVisibility(View.GONE);

                pauseAllBtn.setVisibility(View.VISIBLE);
                startAllBtn.setVisibility(View.GONE);
                saveAllBtn.setVisibility(View.VISIBLE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });

        pauseBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTime2 = chronometer2.getBase() - SystemClock.elapsedRealtime();
                chronometer2.stop();
                startBtn2.setVisibility(View.VISIBLE);
                pauseBtn2.setVisibility(View.GONE);

                pauseAllBtn.setVisibility(View.VISIBLE);
                startAllBtn.setVisibility(View.GONE);
                saveAllBtn.setVisibility(View.VISIBLE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });

        pauseBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTime3 = chronometer3.getBase() - SystemClock.elapsedRealtime();
                chronometer3.stop();
                startBtn3.setVisibility(View.VISIBLE);
                pauseBtn3.setVisibility(View.GONE);

                pauseAllBtn.setVisibility(View.VISIBLE);
                startAllBtn.setVisibility(View.GONE);
                saveAllBtn.setVisibility(View.VISIBLE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });

        pauseBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //stopTime4 = chronometer4.getBase() - SystemClock.elapsedRealtime();
                chronometer4.stop();
                startBtn4.setVisibility(View.VISIBLE);
                pauseBtn4.setVisibility(View.GONE);

                pauseAllBtn.setVisibility(View.VISIBLE);
                startAllBtn.setVisibility(View.GONE);
                saveAllBtn.setVisibility(View.VISIBLE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });

        pauseBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //stopTime5 = chronometer5.getBase() - SystemClock.elapsedRealtime();
                chronometer5.stop();
                startBtn5.setVisibility(View.VISIBLE);
                pauseBtn5.setVisibility(View.GONE);

                pauseAllBtn.setVisibility(View.VISIBLE);
                startAllBtn.setVisibility(View.GONE);
                saveAllBtn.setVisibility(View.VISIBLE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });

        pauseBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //stopTime6 = chronometer6.getBase() - SystemClock.elapsedRealtime();
                chronometer6.stop();
                startBtn6.setVisibility(View.VISIBLE);
                pauseBtn6.setVisibility(View.GONE);
                pauseAllBtn.setVisibility(View.VISIBLE);
                startAllBtn.setVisibility(View.GONE);
                saveAllBtn.setVisibility(View.VISIBLE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });



        pauseBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //stopTime6 = chronometer6.getBase() - SystemClock.elapsedRealtime();
                chronometer7.stop();
                startBtn7.setVisibility(View.VISIBLE);
                pauseBtn7.setVisibility(View.GONE);
                pauseAllBtn.setVisibility(View.VISIBLE);
                startAllBtn.setVisibility(View.GONE);
                saveAllBtn.setVisibility(View.VISIBLE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });



        pauseBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //stopTime6 = chronometer6.getBase() - SystemClock.elapsedRealtime();
                chronometer8.stop();
                startBtn8.setVisibility(View.VISIBLE);
                pauseBtn8.setVisibility(View.GONE);
                pauseAllBtn.setVisibility(View.VISIBLE);
                startAllBtn.setVisibility(View.GONE);
                saveAllBtn.setVisibility(View.VISIBLE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });




        pauseBtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //stopTime6 = chronometer6.getBase() - SystemClock.elapsedRealtime();
                chronometer9.stop();
                startBtn9.setVisibility(View.VISIBLE);
                pauseBtn9.setVisibility(View.GONE);
                pauseAllBtn.setVisibility(View.VISIBLE);
                startAllBtn.setVisibility(View.GONE);
                saveAllBtn.setVisibility(View.VISIBLE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });




        pauseBtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //stopTime6 = chronometer6.getBase() - SystemClock.elapsedRealtime();
                chronometer10.stop();
                startBtn10.setVisibility(View.VISIBLE);
                pauseBtn10.setVisibility(View.GONE);
                pauseAllBtn.setVisibility(View.VISIBLE);
                startAllBtn.setVisibility(View.GONE);
                saveAllBtn.setVisibility(View.VISIBLE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });




        pauseBtn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //stopTime6 = chronometer6.getBase() - SystemClock.elapsedRealtime();
                chronometer11.stop();
                startBtn11.setVisibility(View.VISIBLE);
                pauseBtn11.setVisibility(View.GONE);
                pauseAllBtn.setVisibility(View.VISIBLE);
                startAllBtn.setVisibility(View.GONE);
                saveAllBtn.setVisibility(View.VISIBLE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });




        pauseBtn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //stopTime6 = chronometer6.getBase() - SystemClock.elapsedRealtime();
                chronometer12.stop();
                startBtn12.setVisibility(View.VISIBLE);
                pauseBtn12.setVisibility(View.GONE);
                pauseAllBtn.setVisibility(View.VISIBLE);
                startAllBtn.setVisibility(View.GONE);
                saveAllBtn.setVisibility(View.VISIBLE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });




        pauseBtn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //stopTime6 = chronometer6.getBase() - SystemClock.elapsedRealtime();
                chronometer13.stop();
                startBtn13.setVisibility(View.VISIBLE);
                pauseBtn13.setVisibility(View.GONE);
                pauseAllBtn.setVisibility(View.VISIBLE);
                startAllBtn.setVisibility(View.GONE);
                saveAllBtn.setVisibility(View.VISIBLE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });



        pauseBtn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //stopTime6 = chronometer6.getBase() - SystemClock.elapsedRealtime();
                chronometer14.stop();
                startBtn14.setVisibility(View.VISIBLE);
                pauseBtn14.setVisibility(View.GONE);
                pauseAllBtn.setVisibility(View.VISIBLE);
                startAllBtn.setVisibility(View.GONE);
                saveAllBtn.setVisibility(View.VISIBLE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });



        pauseBtn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //stopTime6 = chronometer6.getBase() - SystemClock.elapsedRealtime();
                chronometer15.stop();
                startBtn15.setVisibility(View.VISIBLE);
                pauseBtn15.setVisibility(View.GONE);
                pauseAllBtn.setVisibility(View.VISIBLE);
                startAllBtn.setVisibility(View.GONE);
                saveAllBtn.setVisibility(View.VISIBLE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });



        pauseBtn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //stopTime6 = chronometer6.getBase() - SystemClock.elapsedRealtime();
                chronometer16.stop();
                startBtn16.setVisibility(View.VISIBLE);
                pauseBtn16.setVisibility(View.GONE);
                pauseAllBtn.setVisibility(View.VISIBLE);
                startAllBtn.setVisibility(View.GONE);
                saveAllBtn.setVisibility(View.VISIBLE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });




        //***************************************************************************
        // Reset buttons
        resetBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer1.setBase(SystemClock.elapsedRealtime());
                stopTime1 = 0;
                chronometer1.stop();
                startBtn1.setVisibility(View.VISIBLE);
                pauseBtn1.setVisibility(View.GONE);

                pauseAllBtn.setVisibility(View.VISIBLE);
                startAllBtn.setVisibility(View.GONE);
                saveAllBtn.setVisibility(View.VISIBLE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });

        resetBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer2.setBase(SystemClock.elapsedRealtime());
                //stopTime2 = 0;
                chronometer2.stop();
                startBtn2.setVisibility(View.VISIBLE);
                pauseBtn2.setVisibility(View.GONE);

                pauseAllBtn.setVisibility(View.VISIBLE);
                startAllBtn.setVisibility(View.GONE);
                saveAllBtn.setVisibility(View.VISIBLE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });

        resetBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer3.setBase(SystemClock.elapsedRealtime());
                stopTime3 = 0;
                chronometer3.stop();
                startBtn3.setVisibility(View.VISIBLE);
                pauseBtn3.setVisibility(View.GONE);
            }
        });

        resetBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer4.setBase(SystemClock.elapsedRealtime());
                stopTime4 = 0;
                chronometer4.stop();
                startBtn4.setVisibility(View.VISIBLE);
                pauseBtn4.setVisibility(View.GONE);

                pauseAllBtn.setVisibility(View.VISIBLE);
                startAllBtn.setVisibility(View.GONE);
                saveAllBtn.setVisibility(View.VISIBLE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });

        resetBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer5.setBase(SystemClock.elapsedRealtime());
                stopTime5 = 0;
                chronometer5.stop();
                startBtn5.setVisibility(View.VISIBLE);
                pauseBtn5.setVisibility(View.GONE);

                pauseAllBtn.setVisibility(View.VISIBLE);
                startAllBtn.setVisibility(View.GONE);
                saveAllBtn.setVisibility(View.VISIBLE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });

        resetBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer6.setBase(SystemClock.elapsedRealtime());
                stopTime6 = 0;
                chronometer6.stop();
                startBtn6.setVisibility(View.VISIBLE);
                pauseBtn6.setVisibility(View.GONE);

                pauseAllBtn.setVisibility(View.VISIBLE);
                startAllBtn.setVisibility(View.GONE);
                saveAllBtn.setVisibility(View.VISIBLE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });


        resetBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer7.setBase(SystemClock.elapsedRealtime());
                stopTime7 = 0;
                chronometer7.stop();
                startBtn7.setVisibility(View.VISIBLE);
                pauseBtn7.setVisibility(View.GONE);

                pauseAllBtn.setVisibility(View.VISIBLE);
                startAllBtn.setVisibility(View.GONE);
                saveAllBtn.setVisibility(View.VISIBLE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });

        resetBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer8.setBase(SystemClock.elapsedRealtime());
                stopTime8 = 0;
                chronometer8.stop();
                startBtn8.setVisibility(View.VISIBLE);
                pauseBtn8.setVisibility(View.GONE);

                pauseAllBtn.setVisibility(View.VISIBLE);
                startAllBtn.setVisibility(View.GONE);
                saveAllBtn.setVisibility(View.VISIBLE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });

        resetBtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer9.setBase(SystemClock.elapsedRealtime());
                stopTime9 = 0;
                chronometer9.stop();
                startBtn9.setVisibility(View.VISIBLE);
                pauseBtn9.setVisibility(View.GONE);

                pauseAllBtn.setVisibility(View.VISIBLE);
                startAllBtn.setVisibility(View.GONE);
                saveAllBtn.setVisibility(View.VISIBLE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });

        resetBtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer10.setBase(SystemClock.elapsedRealtime());
                stopTime10 = 0;
                chronometer10.stop();
                startBtn10.setVisibility(View.VISIBLE);
                pauseBtn10.setVisibility(View.GONE);

                pauseAllBtn.setVisibility(View.VISIBLE);
                startAllBtn.setVisibility(View.GONE);
                saveAllBtn.setVisibility(View.VISIBLE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });


        resetBtn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer11.setBase(SystemClock.elapsedRealtime());
                stopTime11 = 0;
                chronometer11.stop();
                startBtn11.setVisibility(View.VISIBLE);
                pauseBtn11.setVisibility(View.GONE);

                pauseAllBtn.setVisibility(View.VISIBLE);
                startAllBtn.setVisibility(View.GONE);
                saveAllBtn.setVisibility(View.VISIBLE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });


        resetBtn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer12.setBase(SystemClock.elapsedRealtime());
                stopTime12 = 0;
                chronometer12.stop();
                startBtn12.setVisibility(View.VISIBLE);
                pauseBtn12.setVisibility(View.GONE);

                pauseAllBtn.setVisibility(View.VISIBLE);
                startAllBtn.setVisibility(View.GONE);
                saveAllBtn.setVisibility(View.VISIBLE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });


        resetBtn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer13.setBase(SystemClock.elapsedRealtime());
                stopTime13 = 0;
                chronometer13.stop();
                startBtn13.setVisibility(View.VISIBLE);
                pauseBtn13.setVisibility(View.GONE);

                pauseAllBtn.setVisibility(View.VISIBLE);
                startAllBtn.setVisibility(View.GONE);
                saveAllBtn.setVisibility(View.VISIBLE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });


        resetBtn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer14.setBase(SystemClock.elapsedRealtime());
                stopTime14 = 0;
                chronometer14.stop();
                startBtn14.setVisibility(View.VISIBLE);
                pauseBtn14.setVisibility(View.GONE);

                pauseAllBtn.setVisibility(View.VISIBLE);
                startAllBtn.setVisibility(View.GONE);
                saveAllBtn.setVisibility(View.VISIBLE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });


        resetBtn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer15.setBase(SystemClock.elapsedRealtime());
                stopTime15 = 0;
                chronometer15.stop();
                startBtn15.setVisibility(View.VISIBLE);
                pauseBtn15.setVisibility(View.GONE);

                pauseAllBtn.setVisibility(View.VISIBLE);
                startAllBtn.setVisibility(View.GONE);
                saveAllBtn.setVisibility(View.VISIBLE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });


        resetBtn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer16.setBase(SystemClock.elapsedRealtime());
                stopTime16 = 0;
                chronometer16.stop();
                startBtn16.setVisibility(View.VISIBLE);
                pauseBtn16.setVisibility(View.GONE);

                pauseAllBtn.setVisibility(View.VISIBLE);
                startAllBtn.setVisibility(View.GONE);
                saveAllBtn.setVisibility(View.VISIBLE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });


        //Pause All
        pauseAllBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTime1 = chronometer1.getBase() - SystemClock.elapsedRealtime();
                stopTime2 = chronometer2.getBase() - SystemClock.elapsedRealtime();
                stopTime3 = chronometer3.getBase() - SystemClock.elapsedRealtime();
                stopTime4 = chronometer4.getBase() - SystemClock.elapsedRealtime();
                stopTime5 = chronometer5.getBase() - SystemClock.elapsedRealtime();
                stopTime6 = chronometer6.getBase() - SystemClock.elapsedRealtime();
                stopTime7 = chronometer7.getBase() - SystemClock.elapsedRealtime();
                stopTime8 = chronometer8.getBase() - SystemClock.elapsedRealtime();
                stopTime9 = chronometer9.getBase() - SystemClock.elapsedRealtime();
                stopTime10 = chronometer10.getBase() - SystemClock.elapsedRealtime();
                stopTime11 = chronometer11.getBase() - SystemClock.elapsedRealtime();
                stopTime12 = chronometer12.getBase() - SystemClock.elapsedRealtime();
                stopTime13 = chronometer13.getBase() - SystemClock.elapsedRealtime();
                stopTime14 = chronometer14.getBase() - SystemClock.elapsedRealtime();
                stopTime15 = chronometer15.getBase() - SystemClock.elapsedRealtime();
                stopTime16 = chronometer16.getBase() - SystemClock.elapsedRealtime();


                chronometer1.stop();
                chronometer2.stop();
                chronometer3.stop();
                chronometer4.stop();
                chronometer5.stop();
                chronometer6.stop();
                chronometer7.stop();
                chronometer8.stop();
                chronometer9.stop();
                chronometer10.stop();
                chronometer11.stop();
                chronometer12.stop();
                chronometer13.stop();
                chronometer14.stop();
                chronometer15.stop();
                chronometer16.stop();



                saveAllBtn.setVisibility(View.VISIBLE);
                pauseAllBtn.setVisibility(View.GONE);
                startAllBtn.setVisibility(View.VISIBLE);
                resetAllBtn.setVisibility(View.VISIBLE);

            }
        });



        //Start All
        startAllBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTime1 = chronometer1.getBase() - SystemClock.elapsedRealtime();
                stopTime2 = chronometer2.getBase() - SystemClock.elapsedRealtime();
                stopTime3 = chronometer3.getBase() - SystemClock.elapsedRealtime();
                stopTime4 = chronometer4.getBase() - SystemClock.elapsedRealtime();
                stopTime5 = chronometer5.getBase() - SystemClock.elapsedRealtime();
                stopTime6 = chronometer6.getBase() - SystemClock.elapsedRealtime();
                stopTime7 = chronometer7.getBase() - SystemClock.elapsedRealtime();
                stopTime8 = chronometer8.getBase() - SystemClock.elapsedRealtime();
                stopTime9 = chronometer9.getBase() - SystemClock.elapsedRealtime();
                stopTime10 = chronometer10.getBase() - SystemClock.elapsedRealtime();
                stopTime11 = chronometer11.getBase() - SystemClock.elapsedRealtime();
                stopTime12 = chronometer12.getBase() - SystemClock.elapsedRealtime();
                stopTime13 = chronometer13.getBase() - SystemClock.elapsedRealtime();
                stopTime14 = chronometer14.getBase() - SystemClock.elapsedRealtime();
                stopTime15 = chronometer15.getBase() - SystemClock.elapsedRealtime();
                stopTime16 = chronometer16.getBase() - SystemClock.elapsedRealtime();

                chronometer1.start();
                chronometer2.start();
                chronometer3.start();
                chronometer4.start();
                chronometer5.start();
                chronometer6.start();
                chronometer7.start();
                chronometer8.start();
                chronometer9.start();
                chronometer10.start();
                chronometer11.start();
                chronometer12.start();
                chronometer13.start();
                chronometer14.start();
                chronometer15.start();
                chronometer16.start();

                //set each start button to pause so they can be individually paused without having to pause all of them
                startBtn1.setVisibility(View.GONE);
                pauseBtn1.setVisibility(View.VISIBLE);

                startBtn2.setVisibility(View.GONE);
                pauseBtn2.setVisibility(View.VISIBLE);

                startBtn3.setVisibility(View.GONE);
                pauseBtn3.setVisibility(View.VISIBLE);

                startBtn4.setVisibility(View.GONE);
                pauseBtn4.setVisibility(View.VISIBLE);

                startBtn5.setVisibility(View.GONE);
                pauseBtn5.setVisibility(View.VISIBLE);

                startBtn6.setVisibility(View.GONE);
                pauseBtn6.setVisibility(View.VISIBLE);

                startBtn7.setVisibility(View.GONE);
                pauseBtn7.setVisibility(View.VISIBLE);

                startBtn8.setVisibility(View.GONE);
                pauseBtn8.setVisibility(View.VISIBLE);

                startBtn9.setVisibility(View.GONE);
                pauseBtn9.setVisibility(View.VISIBLE);

                startBtn10.setVisibility(View.GONE);
                pauseBtn10.setVisibility(View.VISIBLE);

                startBtn11.setVisibility(View.GONE);
                pauseBtn11.setVisibility(View.VISIBLE);

                startBtn12.setVisibility(View.GONE);
                pauseBtn12.setVisibility(View.VISIBLE);

                startBtn13.setVisibility(View.GONE);
                pauseBtn13.setVisibility(View.VISIBLE);

                startBtn14.setVisibility(View.GONE);
                pauseBtn14.setVisibility(View.VISIBLE);

                startBtn15.setVisibility(View.GONE);
                pauseBtn15.setVisibility(View.VISIBLE);

                startBtn16.setVisibility(View.GONE);
                pauseBtn16.setVisibility(View.VISIBLE);

                //set status of top buttons
                saveAllBtn.setVisibility(View.GONE);
                pauseAllBtn.setVisibility(View.VISIBLE);
                startAllBtn.setVisibility(View.GONE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });


        //Save All
        saveAllBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String saveText;
                //String fileName = "filename.txt";
                String toemailAddress = "mark3431@gmail.com";
                String msubject = "Game Timer";


                chronometer1.stop();
                chronometer2.stop();
                chronometer3.stop();
                chronometer4.stop();
                chronometer5.stop();
                chronometer6.stop();
                chronometer7.stop();
                chronometer8.stop();
                chronometer9.stop();
                chronometer10.stop();
                chronometer11.stop();
                chronometer12.stop();
                chronometer13.stop();
                chronometer14.stop();
                chronometer15.stop();
                chronometer16.stop();


//                stopTime1 = chronometer1.getBase() - SystemClock.elapsedRealtime();
//                stopTime2 = chronometer2.getBase() - SystemClock.elapsedRealtime();
//                stopTime3 = chronometer3.getBase() - SystemClock.elapsedRealtime();
//                stopTime4 = chronometer4.getBase() - SystemClock.elapsedRealtime();
//                stopTime5 = chronometer5.getBase() - SystemClock.elapsedRealtime();
//                stopTime6 = chronometer6.getBase() - SystemClock.elapsedRealtime();



                saveText = Name1.getText().toString()  + "/" + chronometer1.getText().toString() + ";";
                saveText = saveText + Name2.getText().toString()  + "/" + chronometer2.getText().toString() + ";";
                saveText = saveText + Name3.getText().toString()  + "/" + chronometer3.getText().toString() + ";";
                saveText = saveText + Name4.getText().toString()  + "/" + chronometer4.getText().toString() + ";";
                saveText = saveText + Name5.getText().toString()  + "/" + chronometer5.getText().toString() + ";";
                saveText = saveText + Name6.getText().toString()  + "/" + chronometer6.getText().toString() + ";";
                saveText = saveText + Name7.getText().toString()  + "/" + chronometer7.getText().toString() + ";";
                saveText = saveText + Name8.getText().toString()  + "/" + chronometer8.getText().toString() + ";";
                saveText = saveText + Name9.getText().toString()  + "/" + chronometer9.getText().toString() + ";";
                saveText = saveText + Name10.getText().toString()  + "/" + chronometer10.getText().toString() + ";";
                saveText = saveText + Name11.getText().toString()  + "/" + chronometer11.getText().toString() + ";";
                saveText = saveText + Name12.getText().toString()  + "/" + chronometer12.getText().toString() + ";";
                saveText = saveText + Name13.getText().toString()  + "/" + chronometer13.getText().toString() + ";";
                saveText = saveText + Name14.getText().toString()  + "/" + chronometer14.getText().toString() + ";";
                saveText = saveText + Name15.getText().toString()  + "/" + chronometer15.getText().toString() + ";";
                saveText = saveText + Name16.getText().toString()  + "/" + chronometer16.getText().toString() + ";";


                Log.i("Save", saveText);

                try {
                    Intent emailApp = new Intent(Intent.ACTION_SEND);
                    emailApp.putExtra(Intent.EXTRA_EMAIL, new String[] {toemailAddress});
                    emailApp.putExtra(Intent.EXTRA_SUBJECT, msubject);
                    emailApp.putExtra(Intent.EXTRA_TEXT, saveText);
                    emailApp.setType("message/rfc822");
                    startActivity(Intent.createChooser(emailApp, "Send Email Via"));
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Error Occured: "+e,Toast.LENGTH_LONG).show();
                }


                saveAllBtn.setVisibility(View.VISIBLE);
                pauseAllBtn.setVisibility(View.GONE);
                startAllBtn.setVisibility(View.VISIBLE);
                resetAllBtn.setVisibility(View.VISIBLE);
            }
        });





        //Reset All
        resetAllBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                chronometer1.stop();
                chronometer2.stop();
                chronometer3.stop();
                chronometer4.stop();
                chronometer5.stop();
                chronometer6.stop();
                chronometer7.stop();
                chronometer8.stop();
                chronometer9.stop();
                chronometer10.stop();
                chronometer11.stop();
                chronometer12.stop();
                chronometer13.stop();
                chronometer14.stop();
                chronometer15.stop();
                chronometer16.stop();


                chronometer1.setBase(SystemClock.elapsedRealtime());
                chronometer2.setBase(SystemClock.elapsedRealtime());
                chronometer3.setBase(SystemClock.elapsedRealtime());
                chronometer4.setBase(SystemClock.elapsedRealtime());
                chronometer5.setBase(SystemClock.elapsedRealtime());
                chronometer6.setBase(SystemClock.elapsedRealtime());
                chronometer7.setBase(SystemClock.elapsedRealtime());
                chronometer8.setBase(SystemClock.elapsedRealtime());
                chronometer9.setBase(SystemClock.elapsedRealtime());
                chronometer10.setBase(SystemClock.elapsedRealtime());
                chronometer11.setBase(SystemClock.elapsedRealtime());
                chronometer12.setBase(SystemClock.elapsedRealtime());
                chronometer13.setBase(SystemClock.elapsedRealtime());
                chronometer14.setBase(SystemClock.elapsedRealtime());
                chronometer15.setBase(SystemClock.elapsedRealtime());
                chronometer16.setBase(SystemClock.elapsedRealtime());


                stopTime1 = 0;
                stopTime2 = 0;
                stopTime3 = 0;
                stopTime4 = 0;
                stopTime5 = 0;
                stopTime6 = 0;
                stopTime7 = 0;
                stopTime8 = 0;
                stopTime9 = 0;
                stopTime10 = 0;
                stopTime11 = 0;
                stopTime12 = 0;
                stopTime13 = 0;
                stopTime14 = 0;
                stopTime15 = 0;
                stopTime16 = 0;


                startBtn1.setVisibility(View.VISIBLE);
                startBtn2.setVisibility(View.VISIBLE);
                startBtn3.setVisibility(View.VISIBLE);
                startBtn4.setVisibility(View.VISIBLE);
                startBtn5.setVisibility(View.VISIBLE);
                startBtn6.setVisibility(View.VISIBLE);
                startBtn7.setVisibility(View.VISIBLE);
                startBtn8.setVisibility(View.VISIBLE);
                startBtn9.setVisibility(View.VISIBLE);
                startBtn10.setVisibility(View.VISIBLE);
                startBtn11.setVisibility(View.VISIBLE);
                startBtn12.setVisibility(View.VISIBLE);
                startBtn13.setVisibility(View.VISIBLE);
                startBtn14.setVisibility(View.VISIBLE);
                startBtn15.setVisibility(View.VISIBLE);
                startBtn16.setVisibility(View.VISIBLE);



                pauseBtn1.setVisibility(View.GONE);
                pauseBtn2.setVisibility(View.GONE);
                pauseBtn3.setVisibility(View.GONE);
                pauseBtn4.setVisibility(View.GONE);
                pauseBtn5.setVisibility(View.GONE);
                pauseBtn6.setVisibility(View.GONE);
                pauseBtn7.setVisibility(View.GONE);
                pauseBtn8.setVisibility(View.GONE);
                pauseBtn9.setVisibility(View.GONE);
                pauseBtn10.setVisibility(View.GONE);
                pauseBtn11.setVisibility(View.GONE);
                pauseBtn12.setVisibility(View.GONE);
                pauseBtn13.setVisibility(View.GONE);
                pauseBtn14.setVisibility(View.GONE);
                pauseBtn15.setVisibility(View.GONE);
                pauseBtn16.setVisibility(View.GONE);


                startAllBtn.setVisibility(View.VISIBLE);
                pauseAllBtn.setVisibility(View.GONE);
                saveAllBtn.setVisibility(View.GONE);
                resetAllBtn.setVisibility(View.VISIBLE);

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        // Handle item selection
        switch (item.getItemId()) {
            case R.id.editNames:
                Log.i("Menu", "editNames selected");
                Intent intent = new Intent(MainActivity.this, EditNamesActivity.class);
                startActivity(intent);
                Log.i("Menu", "editNames return");
                return true;
            case R.id.action_settings:
                //showHelp();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
