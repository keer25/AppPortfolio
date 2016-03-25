package com.example.keerthana.appportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //Onclick evens for the buttons
    public void launch1(View view) {
        String str = getResources().getString(R.string.launch) +' ' + getResources().getString(R.string.project1) ;
        Toast.makeText(this,str,Toast.LENGTH_LONG).show();
    }

    public void launch2(View view) {
        String str = getResources().getString(R.string.launch) + ' ' +getResources().getString(R.string.project2) ;
        Toast.makeText(this,str,Toast.LENGTH_LONG).show();
    }

    public void launch3(View view) {
        String str = getResources().getString(R.string.launch) + ' ' +getResources().getString(R.string.project3) ;
        Toast.makeText(this,str,Toast.LENGTH_LONG).show();
    }

    public void launch4(View view) {
        String str = getResources().getString(R.string.launch) + ' ' + getResources().getString(R.string.project4) ;
        Toast.makeText(this,str,Toast.LENGTH_LONG).show();
    }

    public void launch5(View view) {
        String str = getResources().getString(R.string.launch) + ' ' +getResources().getString(R.string.project5) ;
        Toast.makeText(this,str,Toast.LENGTH_LONG).show();
    }

    public void launchc(View view) {
        String str = getResources().getString(R.string.launch) + ' ' +getResources().getString(R.string.capstone) ;
        Toast.makeText(this,str,Toast.LENGTH_LONG).show();
    }
}
