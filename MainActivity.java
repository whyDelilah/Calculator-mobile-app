package com.example.tahaayberkkocabicak.calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import java.lang.String.*;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    ArrayList<String> arrayList = new ArrayList<String>();
    String string = "";
    String string1 = "";

    public void onClick1 (View v){

        TextView textView2=(TextView) findViewById(R.id.textView2);
        Button button = (Button)v;
        string = (String) button.getText().toString();

        if( !string.contains("+") && !string.contains("-") && !string.contains("*") && !string.contains("/")){

            string1 = string1 + string;

            if(arrayList.size()>0) {
                arrayList.remove(arrayList.size()-1);
            }
            arrayList.add(string1);

        }

        else{
            arrayList.add(string);
            arrayList.add(string);
            string1="";
        }

        //textView2.setText(textView2.getText().toString()+string);
        textView2.setText(arrayList.toString());
    }

    public void onClick (View v){
        TextView textView1 = (TextView) findViewById(R.id.textView);
        int calc = 0;
        int c = arrayList.size();


        while(c!=1){

            if(c>3){

                if(arrayList.get(3).contains("*") || arrayList.get(3).contains("/")){
                    if(arrayList)

                }

            }



        }
    }





}
