package com.example.njxylophone;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    //Add member variables here
    private SoundPool mSoundPool;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create a new SoundPool
        mSoundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC, 0);

        //Load and get the IDs to identify the sounds
        mCSoundId = mSoundPool.load(getApplicationContext(), R.raw.note1_c, 1);
        mDSoundId = mSoundPool.load(getApplicationContext(), R.raw.note2_d, 1);
        mESoundId = mSoundPool.load(getApplicationContext(), R.raw.note3_e, 1);
        mFSoundId = mSoundPool.load(getApplicationContext(), R.raw.note4_f, 1);
        mGSoundId = mSoundPool.load(getApplicationContext(), R.raw.note5_g, 1);
        mASoundId = mSoundPool.load(getApplicationContext(), R.raw.note6_a, 1);
        mBSoundId = mSoundPool.load(getApplicationContext(), R.raw.note7_b, 1);

    }

    //Add the play methods triggered by the buttons
    public void PlayC (View v){
        Log.d("Xylophone", "Red Button Clickd!");
        mSoundPool.play(mCSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void PlayD (View v){
        Log.d("Xylophone", "Orange Button Clickd!");
        mSoundPool.play(mDSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }

    //Add the play methods triggered by the buttons
    public void PlayE (View v){
        Log.d("Xylophone", "Yello Button Clickd!");
        mSoundPool.play(mESoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void PlayF (View v){
        Log.d("Xylophone", "Green Button Clickd!");
        mSoundPool.play(mFSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void PlayG (View v){
        Log.d("Xylophone", "Turquoise Button Clickd!");
        mSoundPool.play(mGSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void PlayA (View v){
        Log.d("Xylophone", "Bleu Button Clickd!");
        mSoundPool.play(mASoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void PlayB (View v){
        Log.d("Xylophone", "Purple Button Clickd!");
        mSoundPool.play(mBSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }

}
