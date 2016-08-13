package com.sam_chordas.android.stockhawk.rest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.sam_chordas.android.stockhawk.service.StockIntentService;

/**
 * Created by Abhishek on 03-08-2016.
 */
public class MyReceiver extends BroadcastReceiver {
    private static final String TAG = "tag";
    private static final String INIT = "init";

    @Override
    public void onReceive(Context context, Intent intent) {
        intent= new Intent(context, StockIntentService.class);
        intent.putExtra(TAG, INIT);
        context.startService(intent);
    }
}
