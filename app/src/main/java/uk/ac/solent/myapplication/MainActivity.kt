package uk.ac.solent.myapplication

import android.media.AudioManager
import android.media.MediaPlayer
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import uk.ac.solent.myapplication.R.raw.song
import java.io.File

abstract class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val mediaFile = File("${Environment.getExternalStorageDirectory().getAbsolutePath()}/Music/3D_Printer_Slow_Edit_for_Android.mp3")
        val player = MediaPlayer()
        player.setAudioStreamType(AudioManager.STREAM_MUSIC)
        player.setDataSource(applicationContext, Uri.fromFile(mediaFile))
        player.setOnPreparedListener { mp ->
            mp.start()
        }

        player.prepareAsync()

        play.setOnClickListener {
        }

        pause.setOnClickListener {

        }
        rewind.setOnClickListener {
        }
    }





}
