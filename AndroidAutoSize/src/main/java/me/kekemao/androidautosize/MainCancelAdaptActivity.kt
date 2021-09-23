package me.kekemao.androidautosize

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.jessyan.autosize.internal.CancelAdapt

/**
 * 不启用屏幕适配的 Activity，实现 CancelAdapt 接口
 */
class MainCancelAdaptActivity : AppCompatActivity(), CancelAdapt {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_cancel_adapt)
    }
}