package com.example.sampleapp

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello Super Rad. ${platform.name}!"
    }
}