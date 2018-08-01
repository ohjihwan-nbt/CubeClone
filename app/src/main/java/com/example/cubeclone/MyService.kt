package com.example.cubeclone

import android.app.Service
import android.content.Intent
import android.os.IBinder

class MyService : Service() {
    private fun log(message: String) {
        println(message)
    }

    override fun onCreate() {
        super.onCreate()
        log("MyService onCreate")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        log("MyService onStartCommand")
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onBind(p0: Intent?): IBinder {
        log("MyService onBind")
         TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onDestroy() {
        log("MyService onDestroy")
        super.onDestroy()
    }
}