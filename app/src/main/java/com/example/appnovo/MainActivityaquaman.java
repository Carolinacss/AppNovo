package com.example.appnovo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivityaquaman extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityaquaman);
    }
    public void btnvoltaraqua(View va) {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
    public void txtvideoaqua (View via) {
       Uri uri = Uri.parse("https://youtu.be/cB6Wtmx6350?si=2P-ooS-rnaRgc4Kn");
       Intent it = new Intent(Intent.ACTION_VIEW,uri);
       startActivity(it);
    }
}