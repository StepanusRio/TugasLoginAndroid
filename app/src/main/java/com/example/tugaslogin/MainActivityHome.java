package com.example.tugaslogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivityHome extends AppCompatActivity {
    TextView tvWelcome;
    Button btnLogout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);
//        getSupportActionBar().setTitle("Halaman depan");
        tvWelcome = (TextView) findViewById(R.id.tvWellcome);
        btnLogout = (Button) findViewById(R.id.btnLogout);
        String username = getIntent().getStringExtra("username").toString();
        String email = getIntent().getStringExtra("email").toString();
        tvWelcome.setText("Selamat datang: "+username+"("+email+")");
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivityHome.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}