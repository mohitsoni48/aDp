package com.mohitsoni.adp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform