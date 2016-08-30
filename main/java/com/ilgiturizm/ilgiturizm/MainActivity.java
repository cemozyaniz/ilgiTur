package com.ilgiturizm.ilgiturizm;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView fb ;
    ImageView twtr;
    ImageView insta;
    TextView  hacumre   ;
    TextView  hakkimizda;
    TextView  iletisim  ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fb     = (ImageView) findViewById(R.id.facebookImg);
        twtr   = (ImageView) findViewById(R.id.twitterImg);
        insta  = (ImageView) findViewById(R.id.instagramImg);
        hacumre      = (TextView) findViewById(R.id.textView);
        hakkimizda   = (TextView) findViewById(R.id.textView2);
        iletisim     = (TextView) findViewById(R.id.textView3);
    }

    public void hakkimizdaAc(View view){
        Intent intent=new Intent(MainActivity.this,Hakkimizda.class);
        startActivity(intent);
    }
    public void hacUmreRehberiAc(View view){
        Intent intent=new Intent(MainActivity.this,HacUmreRehberi.class);
        startActivity(intent);
    }

    public void yonlendirme(View view) {
        if(view.getId() == fb.getId()){
            fb.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("http://www.facebook.com"));
                    startActivity(intent);
                }
            });
        } else if (view.getId() == twtr.getId()){
            twtr.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("http://www.twitter.com"));
                    startActivity(intent);
                }
            });
        } else if (view.getId() == insta.getId()) {
            insta.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("http://www.instagram.com"));
                    startActivity(intent);
                }
            });
        } else if (view.getId() == hacumre.getId()){
            hacumre.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this,HacUmreRehberi.class);
                    startActivity(intent);
                }
            });
        } else if(view.getId() == hakkimizda.getId()){
            hakkimizda.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this,Hakkimizda.class);
                    startActivity(intent);
                }
            });
        }
    }

}
