package com.example.bai2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class bai3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);
        print();
    }

    static void print()
    {
        int n = 10;
        for(Integer i  = 2; i <= n; i++)
        {
            if(isPrime(i))
                Log.d("So nguyen to: " , i.toString());
        }
    }

    static boolean isPrime(int n) {
        if (n < 2)
            return false;
        else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        }
    }
}