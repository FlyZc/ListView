package com.example.zhouchi.listview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


/**
 * Created by zhouchi on 2016/8/17.
 */
public class ArrayAdapterActivity extends Activity {

    private static final String[] testArray = new String[]{
            "first",
            "second",
            "third",
            "fourth",
            "fifth"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arrayadapter);
        ListView lv = (ListView)findViewById(R.id.lv);
        lv.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, testArray));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ArrayAdapterActivity.this, "cnm你选择了" + testArray[i], Toast.LENGTH_SHORT).show();
                setTitle(testArray[i]);
            }
        });

    }
}
