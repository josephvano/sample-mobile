package com.example.sampleapp

import android.content.res.Resources
import android.os.Build
import android.util.Log
import kotlin.math.round

actual class Settings() {
    actual val osName: String
        get() = "Android"

    actual val osVersion: String
        get() = "${Build.VERSION.SDK_INT}"

    actual val deviceName: String
        get() = "${Build.MANUFACTURER} ${Build.MODEL}"


    actual val density: Int
        get() = round(Resources.getSystem().displayMetrics.density).toInt()

    actual fun logSystemInfo(){
        Log.d("sample-app",
            "(${osName}, ${osVersion}, ${deviceName}, $density)"
            )
    }
}