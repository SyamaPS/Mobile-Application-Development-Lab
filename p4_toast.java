package com.example.syamaps;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class p4_toast extends AppCompatActivity {
EditText String;
Button buttonSubmit;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_p4_toast);
String = (EditText) findViewById(R.id.string);
buttonSubmit = (Button) findViewById(R.id.buttonSubmit);
buttonSubmit.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
Toast toast = new Toast(getApplicationContext());
Toast.makeText(p4_toast.this, String.getText(),
toast.LENGTH_LONG).show();
}
});
}
}
