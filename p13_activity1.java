package com.example.option_context_menu; import
androidx.appcompat.app.AppCompatActivity;import
android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
TextView textView = findViewById(R.id.text_view);
registerForContextMenu(textView);
}
@Override
public boolean onCreateOptionsMenu(Menu menu){
MenuInflater inflater = getMenuInflater();
inflater.inflate(R.menu.option_menu,menu); return
true;
}
@Override
public void onCreateContextMenu(ContextMenu menu, View
v,ContextMenu.ContextMenuInfo menuInfo)

{
super.onCreateContextMenu(menu, v, menuInfo);
//MenuInflater inflater = getMenuInflater();
getMenuInflater().inflate(R.menu.context_menu, menu);
}
@Override
public boolean onOptionsItemSelected(MenuItem item) {
switch (item.getItemId()) {
case R.id.item1:
Toast.makeText(this, "Search selected",
Toast.LENGTH_SHORT).show();
return true;
case R.id.item2:
Toast.makeText(this, "Share selected",
Toast.LENGTH_SHORT).show();
return true;
case R.id.item3:
Toast.makeText(this, "Delete option",
Toast.LENGTH_SHORT).show();
return true;
case R.id.subitem1:
Toast.makeText(this, " Deleted All",
Toast.LENGTH_SHORT).show();
return true;
case R.id.subitem2:
Toast.makeText(this, "Deleted selected fields",
Toast.LENGTH_SHORT).show();
return true;
default:
return super.onOptionsItemSelected(item);
}
}

@Override
public boolean onContextItemSelected(MenuItem item){
switch (item.getItemId()){
case R.id.option_1:
Toast.makeText(this,"Text copied",Toast.LENGTH_SHORT).show();
return true;
case R.id.option_2:
Toast.makeText(this,"Text
pasted",Toast.LENGTH_SHORT).show();
return true;
default:
return super.onContextItemSelected(item);
}
}
}
