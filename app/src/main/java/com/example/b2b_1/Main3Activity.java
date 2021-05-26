package com.example.b2b_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class Main3Activity extends AppCompatActivity {
    WebView webView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Bundle bundle=new Bundle();
        bundle= getIntent().getExtras();
        String myurl=new String();
        myurl=bundle.getString("varsitykey");
        Toast.makeText(Main3Activity.this,"url"+myurl,Toast.LENGTH_LONG).show();
        Toasty.warning(this,"HI HERE IS UNIVERSITY ",Toast.LENGTH_LONG).show();

        webView = (WebView) findViewById(R.id.webid);
        webView.loadUrl(myurl);


    }

    @Override
    public void onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack();
        }
        else {
            super.onBackPressed();

        }

    }
}
