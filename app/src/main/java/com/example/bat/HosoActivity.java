package com.example.bat;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class HosoActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoso);
        Button btnBack= (Button)
                findViewById(R.id.btnOpenMain);
        btnBack.setOnClickListener(new
                                           View.OnClickListener() {
                                               public void onClick(View v) {
                                                   finish();
                                               }
                                           });
    }

}