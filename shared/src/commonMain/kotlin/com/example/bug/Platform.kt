package com.example.bug

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform