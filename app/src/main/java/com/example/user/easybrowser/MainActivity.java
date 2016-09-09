package com.example.user.easybrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    Button btn;
    EditText editText;
    WebView webView;

    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button1);
        editText = (EditText) findViewById(R.id.editText1);
        webView = (WebView) findViewById(R.id.webView1);
        //for javaScript Support
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = editText.getText().toString();
                webView.loadUrl("https://www."+url+".com");


            }
        });


    }


    @Override
    public void onBackPressed() {

        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();

        }
    }


}
