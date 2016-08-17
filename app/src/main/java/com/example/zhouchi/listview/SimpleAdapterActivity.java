package com.example.zhouchi.listview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by zhouchi on 2016/8/17.
 */
public class SimpleAdapterActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simpleadapter);
        ListView lvSimpleAdapter = (ListView)findViewById(R.id.lvSimpleAdapter);
        ArrayList<HashMap<String, Object>> arrayList = new ArrayList<HashMap<String, Object>>();
        for (int i = 0; i < 10; i++) {
            HashMap<String, Object> map = new HashMap<String, Object>();
            map.put("Title", i + "行");
            map.put("Content", "这是第" + i + "行");
            map.put("Image", R.mipmap.ic_launcher);
            arrayList.add(map);
        }
        SimpleAdapter sa = new SimpleAdapter(this, arrayList,R.layout.simpleadapter_item,
                new String[] {"Title", "Content", "Image"},
                new int[] {R.id.tvUp, R.id.tvDown, R.id.iv}
        );
        lvSimpleAdapter.setAdapter(sa);
        lvSimpleAdapter.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(SimpleAdapterActivity.this, "cnm你点击了第" + i + "行", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
