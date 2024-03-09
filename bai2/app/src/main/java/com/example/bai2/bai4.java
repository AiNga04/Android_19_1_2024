package com.example.bai2;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Random;

public class bai4 extends AppCompatActivity {
    TextView txt, txt1;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_bai5);
        input();
        ssnn();
    }

    void input()
    {
        txt = (TextView) findViewById(R.id.txtSoN);
        btn = (Button) findViewById(R.id.btnRnd);
    }

    void ssnn()
    {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rd = new Random();
                int num = rd.nextInt(20);
                ArrayList<Integer> a = new ArrayList<>();
                for(int i = 0; i < num; i++){
                    a.add(rd.nextInt(20));
                }
                String ans = "ArrayList Square : ";
                for(int i= 0; i < num; i++){
                    if(scp(a.get(i))){
                        ans += a.get(i).toString() + " ";
                        Toast.makeText(getApplicationContext(), "This is square : " + a.get(i), Toast.LENGTH_LONG).show();
                    }
                }
                txt.setText(ans);
            }
        });
    }
    boolean scp(int n)
    {
        int tmp = (int)Math.sqrt(n);
        return (tmp*tmp == n);
    }


}