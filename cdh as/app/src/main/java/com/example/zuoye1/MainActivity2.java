package com.example.zuoye1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        String mydj=intent.getStringExtra("mydj");
        if("刀".equals(mydj)){
            ((Button) findViewById(R.id.get1)).setEnabled(false);
        }
        else if("剑".equals(mydj)){
            ((Button) findViewById(R.id.get2)).setEnabled(false);
        }
    }

    public void goumaidao(View view) {
        Intent intent2 = getIntent();
        //String f1 = (intent2.getStringExtra("f1"));
        intent2.putExtra("smz",100);
        intent2.putExtra("gjl",200);
        intent2.putExtra("sd",10);
        intent2.putExtra("lx","刀");
        setResult(1,intent2);
        finish();
    }

    public void goumaijian(View view) {
        Intent intent2 = getIntent();
        //String f1 = (intent2.getStringExtra("f1"));
        intent2.putExtra("smz",200);
        intent2.putExtra("gjl",100);
        intent2.putExtra("sd",15);
        intent2.putExtra("lx","剑");
        setResult(1,intent2);
        finish();
    }
}