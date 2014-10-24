package com.example.student.blogreader;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class BlogPostAdapter extends ArrayAdapter<BlogPost> {
    public BlogPostAdapter(Context context, ArrayList<BlogPost> posts) {
        super(context, 0, posts);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       BlogPost post = getItem(position);

        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.blog_item, parent, false);
        }

        TextView textView = (TextView)convertView.findViewById(R.id.title);
        textView.setText(post.title);
        TextView textView2 = (TextView)convertView.findViewById(R.id.date);
        textView2.setText(post.date);
        TextView textView3 = (TextView)convertView.findViewById(R.id.author);
        textView3.setText(post.author);
        //display the text on the list of the blogs
        return convertView;
    }
}
