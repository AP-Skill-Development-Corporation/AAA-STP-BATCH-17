package com.example.mynotification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    NotificationManager manager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager= (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        findViewById(R.id.b1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {


                if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.O)
                {
                    NotificationChannel channel=new NotificationChannel("gopal_id",
                            "android_channel",NotificationManager.IMPORTANCE_DEFAULT);

                    manager.createNotificationChannel(channel);
                }

                Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.abc);

                NotificationCompat.BigPictureStyle style=
                        new NotificationCompat.BigPictureStyle().bigPicture(bitmap).setSummaryText(getResources().getString(R.string.app_name));

                Intent intent=new Intent(getApplicationContext(),MainActivity.class);

                PendingIntent pi=
                        PendingIntent.getActivity(getApplicationContext(),
                        1,
                        intent,
                        PendingIntent.FLAG_UPDATE_CURRENT);

                NotificationCompat.Builder builder=new
                        NotificationCompat.Builder(MainActivity.this,"gopal_id");

                builder.setContentTitle("APSSDC");

                builder.setContentText("WELCOME TO ANDROID WORKSHOP");

                builder.setSmallIcon(R.drawable.noti);

                builder.setDefaults(NotificationCompat.DEFAULT_ALL);

                builder.setPriority(NotificationCompat.PRIORITY_MAX);

                builder.setAutoCancel(true);

                builder.setStyle(style);

                builder.setLargeIcon(bitmap);

                builder.setContentIntent(pi);

                builder.addAction(R.drawable.reply,"reply",pi);

                manager.notify(1,builder.build());

            }
        });

    }
}
