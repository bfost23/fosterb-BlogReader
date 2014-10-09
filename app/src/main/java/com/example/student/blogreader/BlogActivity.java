package com.example.student.blogreader;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;


public class BlogActivity extends Activity {

    protected ProgressBar progressBar;
    protected ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);

        progressBar = (ProgressBar)findViewById(R.id.progressbar);
        //progressBar.getLayoutParams().height = 500;
        //progressBar.invalidate();
        listView = (ListView)findViewById(R.id.listView);

        listView.setEmptyView(progressBar);

        new BlogPostTask().execute();
    }

}
