package com.example.cubeclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    private fun log(view: View) {
        println(view)
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
    private fun getMyServiceIntent(): Intent {
        return Intent(applicationContext, MyService::class.java)
    }

    fun onServiceStart(view: View) {
        //log(view)
        showToast("서비스 시작 버튼 클릭")
        startService(getMyServiceIntent())
    }

    fun onServiceStop(view: View) {
        //log(view)
        showToast("서비스 종료 버튼 클릭")
        stopService(getMyServiceIntent())
    }
}
