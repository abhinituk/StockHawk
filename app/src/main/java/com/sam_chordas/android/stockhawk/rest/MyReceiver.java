package com.sam_chordas.android.stockhawk.rest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.sam_chordas.android.stockhawk.service.StockIntentService;

/**
 * Created by Abhishek on 03-08-2016.
 */
public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        intent= new Intent(context, StockIntentService.class);
        intent.putExtra("tag","init");
        context.startService(intent);
    }
}
