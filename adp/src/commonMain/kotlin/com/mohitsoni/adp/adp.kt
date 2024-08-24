package com.mohitsoni.adp

import androidx.compose.runtime.Stable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType

var dpRatio = 1f
var spRatio = 1f

expect class DisplayResource
expect value class ADp(val value: Int) {
    companion object{
        fun initializeAdp(resources: DisplayResource, designWidth: Int = 414)
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
