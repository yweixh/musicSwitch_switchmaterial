package com.example.optionsmenutrylang;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.google.android.material.switchmaterial.SwitchMaterial;

public class MainActivity extends AppCompatActivity {
    SwitchCompat music;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        music = findViewById(R.id.on_offMusic);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.math4kids_try);

        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (music.isChecked()){
                    mediaPlayer.start();
                } else {
                    mediaPlayer.pause();
                }
                mediaPlayer.setLooping(true);
            }
        });


    }
}

