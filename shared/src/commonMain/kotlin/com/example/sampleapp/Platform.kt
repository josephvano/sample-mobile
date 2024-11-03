package com.example.sampleapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform