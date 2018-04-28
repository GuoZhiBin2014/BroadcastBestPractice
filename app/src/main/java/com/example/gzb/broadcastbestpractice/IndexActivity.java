package com.example.gzb.broadcastbestpractice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class IndexActivity extends BaseActivity {
    private final String TAG = "IndexActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        Button foreceoffLine = findViewById(R.id.force_offline);
        foreceoffLine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClick: ");
                Intent intent = new Intent("com.example.gzb.broadcastBestPractice.FORCE_OFFLINE");
                sendBroadcast(intent);
            }
        });

    }





}
