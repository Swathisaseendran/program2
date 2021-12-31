package com.example.firstpgm.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("state","create");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("state","start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("state","resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("state","pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("state","stop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("state","restart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("state","destroy");
    }
}