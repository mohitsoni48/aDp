package com.mohitsoni.adp

import android.content.res.Resources

actual typealias DisplayResource = Resources

@JvmInline
actual value class ADp actual constructor(actual val value: Int) {
    actual companion object{
        actual fun initializeAdp(resources: DisplayResource, designWidth: Int) {
            val sweetRatio = resources.displayMetrics.widthPixels.div(resources.displayMetrics.density)
            dpRatio = designWidth.toFloat().div(sweetRatio)
            spRatio = resources.configuration.fontScale.times(dpRatio)
        }
    }
}