package me.kekemao.myfeatdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import java.lang.RuntimeException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickButton(view: View) {
        throw RuntimeException(getString(R.string.msg_kaboom))
//        runOnUiThread { Thread.sleep(10000) }
    }

}