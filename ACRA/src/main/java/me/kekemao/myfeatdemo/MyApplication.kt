package me.kekemao.myfeatdemo

import android.app.Application
import android.content.Context
import org.acra.ACRA
import org.acra.annotation.AcraCore
import org.acra.annotation.AcraHttpSender
import org.acra.data.StringFormat

@AcraCore(buildConfigClass = BuildConfig::class, reportFormat = StringFormat.JSON)
@AcraHttpSender(
    uri = BuildConfig.ACRA_URL,
    httpMethod = org.acra.sender.HttpSender.Method.PUT
)

/**
 * 应用程序
 * @author kekemao00@gmail.com
 * @date 2021/9/17 5:02 下午
 */
class MyApplication : Application() {

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        if (BuildConfig.ACRA_INSTALL) {
            ACRA.init(this)
        }
    }
}