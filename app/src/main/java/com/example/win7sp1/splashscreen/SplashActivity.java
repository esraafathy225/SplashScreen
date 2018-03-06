package com.example.win7sp1.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
      final int SPLASH_DISPLAY_LENGTH =4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(
                new Runnable() {
                    @Override
                    public void run() {
                        Intent intent=new Intent(SplashActivity.this,MainActivity.class);
                        SplashActivity.this.startActivity(intent);
                        SplashActivity.this.finish();
                    }
                },SPLASH_DISPLAY_LENGTH);

    }
}
