package fr.ducalissimo.musique;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

//public class MainActivity extends AppCompatActivity implements View.OnClickListener {

public class MainActivity extends AppCompatActivity {
    
    private Button btnStart, btnStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //btnStart = findViewById(R.id.idBtnStart);
        //btnStop = findViewById(R.id.idBtnStop);

        //btnStart.setOnClickListener(this);
        //btnStop.setOnClickListener(this);

    }

//    @Override
//    public void onClick(View view) {
//        if (view == btnStart) {
//            startService(new Intent(this, MusicService.class));
//            Toast.makeText(this, "Start", Toast.LENGTH_SHORT).show();
//
//        } else {
//            stopService(new Intent(this, MusicService.class));
//            Toast.makeText(this, "Stop", Toast.LENGTH_SHORT).show();
//        }


    public void clickStart(View view) {
        startService(new Intent(this, MusicService.class));
        Toast.makeText(this, "Start", Toast.LENGTH_SHORT).show();
    }

    public void clickStop(View view) {
        stopService(new Intent(this, MusicService.class));
        Toast.makeText(this, "Stop", Toast.LENGTH_SHORT).show();
    }

}