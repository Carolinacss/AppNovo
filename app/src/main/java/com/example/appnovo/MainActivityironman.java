package com.example.appnovo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivityironman extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityironman);
    }
    public void btnvoltar5(View vm) {
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }
    public void txtvideoiron (View viim) {
        Uri uri = Uri.parse("https://youtu.be/7RA496XE2Mo?si=G0RtlRG9-qUN366s");
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(it);
    }
}