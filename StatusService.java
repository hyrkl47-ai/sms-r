package com.vanta.core;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/** Benign placeholder service; it performs no background work. */
public class StatusService extends Service {
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        stopSelf(startId);
        return START_NOT_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
