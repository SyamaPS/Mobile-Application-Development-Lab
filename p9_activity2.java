package com.example.mad8;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class SecondActivity extends AppCompatActivity {
TextView receiver_msg;
@Override
protected void onCreate(Bundle savedInstanceState)
{
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_second);
receiver_msg = (TextView)findViewById(R.id.received_value_id);
Intent intent = getIntent();
String str = intent.getStringExtra("message_key");
receiver_msg.setText(str);
}
}