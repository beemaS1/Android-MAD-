package com.example.listview;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    String fruitlist[]= {"apple","kiwi","ff","orange"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        listView=(ListView) findViewById(R.id.list);
        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(this,R.layout.activity_main2,R.id.textview,fruitlist);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.i("ListView","item is clicked@position" +i);
                if (i==0){
                    startActivity(new Intent(MainActivity.this, apple.class));
                } else if (i==1) {
                        startActivity(new Intent(MainActivity.this, kiwi.class));

                }
                else if (i==2) {
                    startActivity(new Intent(MainActivity.this, ff.class));

                }
                else if (i==3) {
                    startActivity(new Intent(MainActivity.this, orange.class));

                }
            }
        });


    }
}