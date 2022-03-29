package com.example.listview;
import androidx.appcompat.app.AppCompatActivity;import
android.icu.text.DateFormatSymbols;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView; import
android.widget.Toast;
public class MainActivity extends AppCompatActivity implements
AdapterView.OnItemClickListener {
ListView list;
String[] months;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
list=findViewById(R.id.list);
months=new DateFormatSymbols().getMonths();
//ArrayAdapter<String> monthAdapter =new
ArrayAdapter<>(this,android.R.layout.simple_list_item_1,months);
ArrayAdapter<String> monthAdapter =new
ArrayAdapter<>(this,R.layout.list_item,months);
list.setAdapter(monthAdapter);
list.setOnItemClickListener(this);
}
@Override
public void onItemClick(AdapterView<?> parent, View view, int position,
long id) {
//String month=parent.getItemAtPosition(position).toString();
//String month = months[position];

//String month= ((TextView)view).getText().toString();
String month=list.getItemAtPosition(position).toString();
Toast.makeText(getApplicationContext(),"Clicked"
+month,Toast.LENGTH_SHORT).show();
}
}
