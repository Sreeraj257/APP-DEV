package com.example.kydmedfinal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;


class RemainderBroadcast1 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        NotificationCompat.Builder builder =new NotificationCompat.Builder(context,"notifylemubit2")
                .setSmallIcon(R.drawable.ic_android_black_24dp)
                .setContentTitle("remiande")
                .setContentText("hello")
                .setAutoCancel(true)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);
        NotificationManagerCompat notificationManager =NotificationManagerCompat.from(context);
        notificationManager.notify(102,builder.build());


    }
}
