package com.example.appnovo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivitybatman extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitybatman);
    }
    public void btnvoltarbat(View vb) {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
    public void txtvideobat (View viba) {
        Uri uri = Uri.parse("https://youtu.be/sTtHbO5b5GE?si=b6emhCfFd6V5AGWB");
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(it);
    }
}