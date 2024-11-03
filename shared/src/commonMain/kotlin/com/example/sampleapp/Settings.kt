package com.example.sampleapp

expect class Settings {
    val osName: String
    val osVersion: String
    val deviceName: String
    val density: Int

    fun logSystemInfo()
}