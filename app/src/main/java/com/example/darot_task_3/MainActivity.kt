package com.example.darot_task_3

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var player: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var playButton = findViewById<Button>(R.id.play_button)
        var stopButton = findViewById<Button>(R.id.stop_button)

        player = MediaPlayer.create(applicationContext, R.raw.song)
        playButton.setOnClickListener {
            player.start()
        }

        stopButton.setOnClickListener {
            if(player.isPlaying) {
                player.stop()
                player.reset()
                player.release()
            }
        }
    }
}