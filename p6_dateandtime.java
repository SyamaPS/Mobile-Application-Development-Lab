package com.example.mad6;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class MainActivity extends AppCompatActivity {
Button button;
TextView dt,tym;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
Button button = findViewById(R.id.button);
TextView dt= findViewById(R.id.textview1);
TextView tym= findViewById(R.id.textview2);
button.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
Calendar calendar = Calendar.getInstance();
DateFormat d = new SimpleDateFormat("dd/MM/yyyy");
DateFormat t = new SimpleDateFormat("hh:mm");
String date= d.format(calendar.getTime());
String time = t.format(calendar.getTime());
dt.setText(date);
tym.setText(time);
}
});
}
}
