package com.example.zuoye1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static int a,b,c,d;
    private static String f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void shangdian(View view) {
        Intent intent = new Intent();
        intent.setClass(this, MainActivity2.class);
        intent.putExtra("mydj",f);
        startActivityForResult(intent,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==1){
            if(resultCode ==1){
                int smz1 = data.getIntExtra("smz",0);
                int gjl1 = data.getIntExtra("gjl",0);
                int sd1 = data.getIntExtra("sd",0);
                //int lx=Integer.parseInt(data.getStringExtra("lx"));
                String aa=data.getStringExtra("lx");
                a=smz1;
                b=gjl1;
                c=sd1;
                //d=lx;
                f=aa;
            }
            TextView t1 = findViewById(R.id.smz);
            TextView t2 = findViewById(R.id.gjl);
            TextView t3 = findViewById(R.id.sd);
            t1.setText(a+"");
            t2.setText(b+"");
            t3.setText(c+"");
            ProgressBar pro1 =  findViewById(R.id.pro1);
            ProgressBar pro2 =  findViewById(R.id.pro2);
            ProgressBar pro3 =  findViewById(R.id.pro3);
            pro1.setMax(300);
            pro2.setMax(300);
            pro3.setMax(30);
            pro1.setProgress(a);
            pro2.setProgress(b);
            pro3.setProgress(c);
            TextView textView = findViewById(R.id.textView);
            textView.setText("当前装备的武器为"+f);

        }
    }
}