package com.example.sampleapp

import platform.Foundation.NSLog
import platform.UIKit.UIDevice
import platform.UIKit.UIScreen

actual class Settings {
    actual val osName: String
        get() = UIDevice.currentDevice.systemName
    actual val osVersion: String
        get() = UIDevice.currentDevice.systemVersion
    actual val deviceName: String
        get() = UIDevice.currentDevice.model
    actual val density: Int
        get() = UIScreen.mainScreen.scale.toInt()

    actual fun logSystemInfo() {
        NSLog(
            "($osName, $osVersion, $deviceName, $density"
        )
    }
}