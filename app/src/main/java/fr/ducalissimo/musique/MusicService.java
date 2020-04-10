package fr.ducalissimo.musique;


import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;

import androidx.annotation.Nullable;

public class MusicService extends Service {

    private MediaPlayer mMediaPlayer;


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    // Méthode pour démarrer le service créé
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        mMediaPlayer = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI);
        mMediaPlayer.setLooping(true);
        mMediaPlayer.start();
        // Le service est démarré
        return START_STICKY;
    }

    // Méthode pour stopper le service créé
    @Override
    public void onDestroy() {
        mMediaPlayer.stop();
        super.onDestroy();
    }

    public MediaPlayer getMusicService() {
        return mMediaPlayer;
    }
}
