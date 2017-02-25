package com.example.boris3327.finalproject;

import android.content.Intent;
import android.icu.text.BreakIterator;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView tvNum;
    TextView tvMap;
    TextView tvSite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvNum = (TextView) findViewById(R.id.tvNum);
        tvMap = (TextView) findViewById(R.id.tvMap);

        tvNum.setOnClickListener(this);
        tvMap.setOnClickListener(this);
        tvSite.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.tvNum:
                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+380933381359"));
                startActivity(intent);
                break;
            case R.id.tvMap:
                intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:49.437336, 32.072080"));
                startActivity(intent);
                break;
            case R.id.tvSite:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kinopoisk.ru/film/885658/"));
                startActivity(intent);
                break;
        }
    }
}
