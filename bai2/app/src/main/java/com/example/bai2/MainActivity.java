package com.example.bai2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnDangnhap;
    TextView txtNoiDung1;
    TextView editTextname, editTextpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        login();
    }
    void login()
    {
        txtNoiDung1 = (TextView) findViewById(R.id.textView1);
        btnDangnhap =(Button) findViewById(R.id.btnDangNhap);
        editTextname = (EditText) findViewById(R.id.editTextName);
        editTextpass = (EditText) findViewById(R.id.editTextPassword);
        btnDangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editTextname.getText().toString().equals("admin") && editTextpass.getText().toString().equals("admin")){
                    txtNoiDung1.setText("Đăng nhập thành công!");
                    editTextname.setText("");
                    editTextpass.setText("");
                    editTextname.setVisibility(View.GONE);
                    editTextpass.setVisibility(View.GONE);
                    btnDangnhap.setVisibility(View.GONE);
                }else{
                    editTextpass.setText("");
                    txtNoiDung1.setText("Đăng nhập thất bại" + editTextpass.getText().toString());
                }
            }
        });
    }
}