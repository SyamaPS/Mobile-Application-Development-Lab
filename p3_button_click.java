package com.example.syamaps;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class p3_button_click extends AppCompatActivity {
TextView a1,a2,a3;
Buttonb1b2b3;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_p3_button_click);
a1=(TextView) findViewById(R.id.a1);
a2=(TextView) findViewById(R.id.a2);
a3=(TextView) findViewById(R.id.a3);
b1=(Button) findViewById(R.id.b1);
b2=(Button) findViewById(R.id.b2);
b3=(Button)findViewById(R.id.b3);
b1.setOnClickListener(new
View.OnClickListener(){@Override
public void onClick(View v) {
a1.setText("Archimedes")}
});
b2.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View v) {
a2.setText("Hipparchus")}
});
b3.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View v) {
a3.setText("Galileo
Galili”)}
});