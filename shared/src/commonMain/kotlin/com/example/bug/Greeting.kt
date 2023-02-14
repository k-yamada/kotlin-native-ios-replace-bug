package com.example.bug

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        println("買っ".replace("掌", "X"))
        println("買".replace("掌", "X"))
        return "Hello, ${platform.name}!"
    }
}
