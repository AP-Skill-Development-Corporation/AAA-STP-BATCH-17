package com.example.workexample;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class SecondWork extends Worker
{
    NotificationManager manager;

    public SecondWork(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {
        manager= (NotificationManager) getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE);

        sendnotification();

        return Result.success();
    }

    private void sendnotification() {
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.O)
        {

            NotificationChannel channel=new NotificationChannel("gopal_id","android_channel",NotificationManager.IMPORTANCE_HIGH);

            manager.createNotificationChannel(channel);

        }


        NotificationCompat.Builder builder=new NotificationCompat.Builder(getApplicationContext(),"gopal_id");

        builder.setContentTitle("APSSDC");

        builder.setDefaults(NotificationCompat.DEFAULT_ALL);

        builder.setContentText("WELCOME TO ANDROID APP DEVELOPEMENT");

        manager.notify(1,builder.build());


    }

}
