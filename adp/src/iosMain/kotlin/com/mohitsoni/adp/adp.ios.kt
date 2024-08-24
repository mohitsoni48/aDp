package com.mohitsoni.adp

import platform.CoreGraphics.CGRect

actual typealias DisplayResource = CGRect

actual value class ADp actual constructor(actual val value: Int){
    actual companion object{
        actual fun initializeAdp(resources: DisplayResource, designWidth: Int) {
            val width = resources.size.width
            val height = resources.size.height
        }
    }
}