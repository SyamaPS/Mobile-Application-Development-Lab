package com.example.syamaps;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
public class p5_calculator extends AppCompatActivity {
EditText e1, e2;
TextView t1;
int first, second;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_p5_calculator);
}
public boolean getNumbers()
{
e1 = (EditText) findViewById(R.id.first);
e2 = (EditText) findViewById(R.id.second);
t1 = (TextView) findViewById(R.id.result);
String s1 = e1.getText().toString();
String s2 = e2.getText().toString();
if ((s1.equals(null) && s2.equals(null))
|| (s1.equals("") && s2.equals(""))) {
String result = "NO INPUT";
t1.setText(result);
return false;
} else {
14
// converting string to int.
first = Integer.parseInt(s1);
// converting string to int.
second = Integer.parseInt(s2);
}
return true;
}
public void doSum(View v) {
if (getNumbers()) {
int sum = first + second;
t1.setText(Integer.toString(sum));
}
}
public void doSub(View v) {
if (getNumbers()) {
int sum = first - second;
t1.setText(Integer.toString(sum));
}
}
public void doMul(View v) {
if (getNumbers()) {
int sum = first * second;
t1.setText(Integer.toString(sum));
}
}
public void doDiv(View v) {
if (getNumbers()) {
double sum = first / (second * 1.0);
t1.setText(Double.toString(sum));
}
}
