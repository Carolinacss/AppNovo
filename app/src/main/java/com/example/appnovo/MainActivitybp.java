package com.example.appnovo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivitybp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitybp);
    }
    public void btnvoltarbp(View vbp) {
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }
    public void txtvideobp (View vibp) {
        Uri uri = Uri.parse("https://youtu.be/xoIUPvLP2ZY?si=NIjgosr9LNNSqG7Z");
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(it);
    }
}