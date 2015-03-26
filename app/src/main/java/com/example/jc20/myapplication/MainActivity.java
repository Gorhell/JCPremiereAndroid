package com.example.jc20.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TabWidget;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /* TabHost */

        TabHost tabHost = (TabHost) findViewById(R.id.tabHost);
        tabHost.setup();




        TabHost.TabSpec tabSpec = tabHost.newTabSpec("home");
        tabSpec.setContent(R.id.home);
        tabSpec.setIndicator("Home" , getResources().getDrawable(R.drawable.hometab));
        tabHost.addTab(tabSpec);




        tabSpec = tabHost.newTabSpec("contact us");
        tabSpec.setContent(R.id.contactus);
        tabSpec.setIndicator("Contact Us" , getResources().getDrawable(R.drawable.contacttab) );
        tabHost.addTab(tabSpec);




        tabSpec = tabHost.newTabSpec("my account");
        tabSpec.setContent(R.id.myaccount);
        tabSpec.setIndicator("My Account" , getResources().getDrawable(R.drawable.accounttab));
        tabHost.addTab(tabSpec);




        String url = "http://www.jcpremiere247.com/jcportal/login.php";
        WebView view = (WebView) findViewById(R.id.webView);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);





        ImageButton btn1 = (ImageButton) findViewById(R.id.aboutus);
            btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                startActivity(new Intent(MainActivity.this, aboutUs.class));


            }
        });

        ImageButton btn = (ImageButton) findViewById(R.id.products);
         btn.setOnClickListener(new View.OnClickListener() {

           @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, products.class));


           }
       });


        ImageButton btn3 = (ImageButton) findViewById(R.id.cplan);
        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, plan.class));


            }
        });

        ImageButton btn2 = (ImageButton) findViewById(R.id.videos);
        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v2) {
                startActivity(new Intent(MainActivity.this, videos.class));


            }
        });

    }








    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) return true;

        return super.onOptionsItemSelected(item);
    }


}
