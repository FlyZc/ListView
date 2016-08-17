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
public class CheckedArrayAdapterActivity extends Activity {
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
        setContentView(R.layout.activity_checkedarrayadapter);

        ListView lvChecked = (ListView)findViewById(R.id.lvChecked);
        lvChecked.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_checked, testArray));
        lvChecked.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        lvChecked.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(CheckedArrayAdapterActivity.this, "你选择了" + testArray[i], Toast.LENGTH_SHORT).show();
            }
        });

        ListView lvMulti = (ListView)findViewById(R.id.lvMulti);
        lvMulti.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_checked, testArray));
        lvMulti.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        lvMulti.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(CheckedArrayAdapterActivity.this, "你选择了" + testArray[i], Toast.LENGTH_SHORT).show();
            }
        });

        ListView lvSingle = (ListView)findViewById(R.id.lvSingle);
        lvSingle.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_checked, testArray));
        lvSingle.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        lvSingle.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(CheckedArrayAdapterActivity.this, "你选择了" + testArray[i], Toast.LENGTH_SHORT).show();
            }
        });



    }
}
