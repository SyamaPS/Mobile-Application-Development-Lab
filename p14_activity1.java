package com.example.alertbox;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle; import
android.view.View; import
android.widget.Button; import
android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
Button button;
@Override

protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
button= (Button) findViewById(R.id.button);
button.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View v) {
AlertDialog.Builder builder = new
AlertDialog.Builder(MainActivity.this); builder.setMessage("Do
you want to exit ?");builder.setTitle("Alert !");
builder.setPositiveButton("Yes", new
DialogInterface.OnClickListener() {
@Override
public void onClick(DialogInterface dialog, int which) {
// When the user click yes button then app will close
finish();
}
});
builder.setNegativeButton("No", new
DialogInterface.OnClickListener() {
@Override
public void onClick(DialogInterface dialog, int which) {
// When the user click no button then then dialog box is canceled.
}
});
dialog.cancel();

}
});
AlertDialog alertDialog = builder.create();alertDialog.show();
}
}