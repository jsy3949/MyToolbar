package com.jsy3949.mytoolbar;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class IntroActivity extends AppCompatActivity {

    private Handler handler;

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            Intent intent = new Intent(IntroActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
            overridePendingTransition(android.R.anim.fade_in ,android.R.anim.fade_out);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        init();
        handler.postDelayed(runnable, 1500); //인트로 페이지를 진행하는 시간 부여
    }

    private void init() {
        handler = new Handler();
    }

    /*앱이 실행되면서 발생하는 안드로이드 시스템 러닝(runnable)을 동작을 제거한다, 불필요한 메모리 과부하 방지*/
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        handler.removeCallbacks(runnable);
    }
}
