package com.nynelyne.fontawesomeinandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CardView cardView_sharePrice, cardView_dailyCommentary, cardView_newsHeadlines, cardView_investingForBeginners, cardView_brokerageFirms, cardView_listedCompanies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpCardClick();
    }

    private void setUpCardClick()
    {
        cardView_sharePrice = (CardView) findViewById(R.id.share_price);
        cardView_dailyCommentary = (CardView) findViewById(R.id.daily_commentary);
        cardView_newsHeadlines = (CardView) findViewById(R.id.news_headlines);
        cardView_investingForBeginners = (CardView) findViewById(R.id.investing_for_beginners);
        cardView_brokerageFirms = (CardView) findViewById(R.id.brokerage_firms);
        cardView_listedCompanies = (CardView) findViewById(R.id.listed_companies);

        cardView_sharePrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This is my Toast message!",
                        Toast.LENGTH_LONG).show();
            }
        });

        cardView_dailyCommentary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This is my Toast message!",
                        Toast.LENGTH_LONG).show();
            }
        });

        cardView_newsHeadlines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This is my Toast message!",
                        Toast.LENGTH_LONG).show();
            }
        });

        cardView_investingForBeginners.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This is my Toast message!",
                        Toast.LENGTH_LONG).show();
            }
        });

        cardView_brokerageFirms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This is my Toast message!",
                        Toast.LENGTH_LONG).show();
            }
        });

        cardView_listedCompanies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This is my Toast message!",
                        Toast.LENGTH_LONG).show();
            }
        });
    }

}
