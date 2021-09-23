package me.kekemao.androidautosize

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.jessyan.autosize.AutoSizeConfig
import me.jessyan.autosize.internal.CustomAdapt

/**
 * 启用屏幕适配的 activity，实现 CustomAdapt 接口
 */
class MainActivity : AppCompatActivity(), CustomAdapt {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AutoSizeConfig.getInstance().isCustomFragment = true
    }

    override fun isBaseOnWidth(): Boolean {
        return false
    }

    override fun getSizeInDp(): Float {
        return 667f
    }
}