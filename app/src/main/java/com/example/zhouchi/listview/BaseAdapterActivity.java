package com.example.zhouchi.listview;

import android.app.Activity;
import android.app.LauncherActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ForkJoinTask;

/**
 * Created by zhouchi on 2016/8/17.
 */
public class BaseAdapterActivity extends Activity {

    private ArrayList<Map<String, Object>> listItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baseadapter);
        ListView lvBase = (ListView)findViewById(R.id.lvBaseAdapter);
        listItem = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < 10; i++) {
            HashMap<String, Object> map = new HashMap<String, Object>();
            map.put("Title", i + "行");
            map.put("Content", "这是第" + i + "行");
            map.put("Image", R.mipmap.ic_launcher);
            listItem.add(map);
        }
        lvBase.setAdapter(new MyAdapter(this));
        lvBase.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(BaseAdapterActivity.this, "你点击了第" + i + "个ListView", Toast.LENGTH_SHORT).show();
            }
        });

    }
    class MyAdapter extends BaseAdapter {
        LayoutInflater layoutInflater;
        public MyAdapter (Context context){
            this.layoutInflater = LayoutInflater.from(context);
        }

        @Override
        public int getCount() {
            return listItem.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            ViewHolder viewHolder;
            if (view == null) {
                view = layoutInflater.inflate(R.layout.baseadapter_item, null);
                viewHolder = new ViewHolder();
                viewHolder.title = (TextView)view.findViewById(R.id.tvBaseUp);
                viewHolder.content = (TextView)view.findViewById(R.id.tvBaseDown);
                viewHolder.button = (Button)view.findViewById(R.id.btnBase);
                view.setTag(viewHolder);

            }
            else {
                viewHolder = (ViewHolder)view.getTag();
            }

            viewHolder.title.setText(listItem.get(i).get("Title").toString());
            viewHolder.content.setText(listItem.get(i).get("Content").toString());
            final int num = i;
            viewHolder.button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(BaseAdapterActivity.this, "你点击的是第" + num + "个按钮", Toast.LENGTH_SHORT).show();
                }
            });
            return view;
        }
    }
    public class ViewHolder {
        TextView title;
        TextView content;
        Button button;
    }
}
