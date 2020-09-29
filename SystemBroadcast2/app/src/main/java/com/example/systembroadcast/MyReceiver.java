package com.example.systembroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;

public class MyReceiver extends BroadcastReceiver {

    ImageView img;

    public MyReceiver(ImageView imageView)
    {

        this.img=imageView;
    }

    @Override
    public void onReceive(Context context, Intent intent)
    {

        switch (intent.getAction())
        {
            case Intent.ACTION_POWER_CONNECTED:
                img.setImageResource(R.drawable.powerconnect);
                break;
            case Intent.ACTION_POWER_DISCONNECTED:
                img.setImageResource(R.drawable.powerdisconnect);
                break;
            case Intent.ACTION_AIRPLANE_MODE_CHANGED:
                img.setImageResource(R.drawable.airplanemode);
                break;
        }
    }
}
