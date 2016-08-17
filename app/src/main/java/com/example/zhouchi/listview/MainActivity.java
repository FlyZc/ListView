package com.example.zhouchi.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void arrayAdapter(View v) {
        Intent intent = new Intent(this, ArrayAdapterActivity.class);
        startActivity(intent);
    }
    public void checkAdapter(View v) {
        Intent intent = new Intent(this, CheckedArrayAdapterActivity.class);
        startActivity(intent);
    }
    public void simpleAdapter(View v) {
        Intent intent = new Intent(this, SimpleAdapterActivity.class);
        startActivity(intent);
    }
    public void baseAdapter(View v) {
        Intent intent = new Intent(this, BaseAdapterActivity.class);
        startActivity(intent);
    }

}
