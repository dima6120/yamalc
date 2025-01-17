package com.dima6120.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.ui.graphics.Color
import com.dima6120.core_api.model.mylist.ListStatusModel

object YamalcColors {
    val PrimaryColorLight = Color(0xFF2E51A2)
    val PrimaryVariantColorLight = Color(0xFF224889)
    val SecondaryColorLight = Color(0xFFFAFBFD)
    val SecondaryVariantColorLight = Color(0xFFF6F6F6)
    val SurfaceColorLight = Color(0xFFFFFFFF)
    val BackgroundColorLight = Color(0xFFFFFFFF)

    val Black = Color(0xFF000000)
    val Gray5C = Color(0xFF5C5C5C)
    val Gray78 = Color(0xFF787878)
    val Gray80 = Color(0xFF808080)
    val Green = Color(0xFF2FAF36)
    val Blue = Color(0xFF28448D)
    val Red = Color(0xFFA22E2E)
    val Yellow = Color(0xFFF4D360)
}

fun ListStatusModel.toColor(): Color =
    when (this) {
        ListStatusModel.WATCHING -> YamalcColors.Green
        ListStatusModel.COMPLETED -> YamalcColors.PrimaryVariantColorLight
        ListStatusModel.ON_HOLD -> YamalcColors.Yellow
        ListStatusModel.DROPPED -> YamalcColors.Red
        ListStatusModel.PLAN_TO_WATCH -> YamalcColors.Gray5C
    }

