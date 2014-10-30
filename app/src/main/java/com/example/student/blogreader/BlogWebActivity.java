package com.example.student.blogreader;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class BlogWebActivity extends Activity{
    protected ProgressBar progressBar;
    protected WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog_web);
        progressBar = (ProgressBar)findViewById(R.id.progressBarWebView);
        webView = (WebView)findViewById(R.id.webView);

        Intent intent = getIntent();
        Uri blogUri = intent.getData();

        webView.loadUrl(blogUri.toString());
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageFinished(WebView view, String url) {
                progressBar.setVisibility(View.GONE);
            }

        });
    }
}
