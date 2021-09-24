package me.kekemao.androidannotations_api

import android.graphics.Color
import android.util.Log
import android.view.KeyEvent
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import org.androidannotations.annotations.*

/**
 * 注释功能列表： https://github.com/androidannotations/androidannotations/wiki/AvailableAnnotations
 *
 * @property TAG String
 *  activity 前面需要用 open 修饰
 */
//@WindowFeature(Window.FEATURE_NO_TITLE, Window.FEATURE_INDETERMINATE_PROGRESS)
@EActivity(R.layout.activity_main)
@Fullscreen
open class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    /**
     * ViewById() 使用
     * https://stackoverflow.com/questions/45701157/androidannotations-viewbyid-cannot-be-used-on-a-private-element
     */
    @ViewById(R.id.btn_1)
    @JvmField
    var btn_1: Button? = null

    @ViewById(R.id.tv_1)
    @JvmField
    var tv_1: TextView? = null

    @ViewById(R.id.cl_rootView)
    lateinit var cl_rootView: ConstraintLayout

    @UiThread
    open fun uiStart() {
        Log.i(TAG, "uiStaart: 当前线程名：" + Thread.currentThread().name)
        tv_1?.text = "uiStart"
        cl_rootView.setBackgroundColor(Color.GREEN);
    }

    @Background
    open fun backStart() {
        Log.i(TAG, "backStart: 当前线程名：" + Thread.currentThread().name)


//        Log.i("TAG", "events: client= client" + client)
    }


    @Click(R.id.btn_1)
    open fun btn_1() {
        Toast.makeText(this, "点击了按钮", Toast.LENGTH_SHORT).show()
        backStart()
        uiStart()
    }


    @KeyDown(KeyEvent.KEYCODE_VOLUME_DOWN, KeyEvent.KEYCODE_VOLUME_UP)
    open fun keyDownF(keyEvent: KeyEvent): Boolean {
        Log.i(TAG, "keyboard: keyevent.keycode=" + keyEvent.keyCode)
        return false
    }

}


