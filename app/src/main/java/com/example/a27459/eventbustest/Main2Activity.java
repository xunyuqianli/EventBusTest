
package com.example.a27459.eventbustest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import de.greenrobot.event.EventBus;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }

    public void sendMsg(View view) {
        MessageEvent messageEvent = new MessageEvent("发来消息");
        EventBus.getDefault().post(messageEvent);

    }
}
