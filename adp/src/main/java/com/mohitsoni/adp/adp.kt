package com.mohitsoni.adp

import android.content.res.Resources
import androidx.compose.runtime.Stable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType

private var _dpRatio = 1f
private var _spRatio = 1f
val dpRatio
    get() = _dpRatio
val spRatio
    get() = _spRatio

@JvmInline
value class ADp constructor(val value: Int) {
    companion object{
        fun initializeAdp(resources: Resources, designWidth: Int) {
            val sweetRatio = resources.displayMetrics.widthPixels.div(resources.displayMetrics.density)
            _dpRatio = designWidth.toFloat().div(sweetRatio)
            _spRatio = resources.configuration.fontScale.times(dpRatio)
        }
    }
}


@Stable
inline val Int.aDp: Dp
    get() = Dp(value = this.toFloat().div(dpRatio))

@Stable
inline val Double.aDp: Dp
    get() = Dp(value = this.toFloat().div(dpRatio))

@OptIn(ExperimentalUnitApi::class)
@Stable
inline val Int.aSp: TextUnit
    get() = TextUnit(value = this.toFloat().div(spRatio), TextUnitType.Sp)

@OptIn(ExperimentalUnitApi::class)
@Stable
inline val Double.aSp: TextUnit
    get() = TextUnit(value = this.toFloat().div(spRatio), TextUnitType.Sp)