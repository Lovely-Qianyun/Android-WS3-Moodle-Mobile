package com.example.android_ws3_moodle_mobile;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.SimpleAdapter;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CourseListActivity extends ListActivity {
    ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = this.getIntent();
        ArrayList<String> courseName = intent.getStringArrayListExtra("CourseName");
        ArrayList<String> teachers = intent.getStringArrayListExtra("Teachers");

        for (int i = 0; i < courseName.size(); i++) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("CourseName", courseName.get(i));
            map.put("Teachers", teachers.get(i));
            list.add(map);
        }
        SimpleAdapter adapter = new SimpleAdapter(this, list, R.layout.course_list_item,
                new String[]{"CourseName", "Teachers"},
                new int[]{R.id.coursename, R.id.teachers});
        setListAdapter(adapter);
    }
}