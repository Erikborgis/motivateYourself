package com.pocketqueens.motivateyourself

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.pocketqueens.motivateyourself.R

sealed class MenuAction(@StringRes val label: Int, @DrawableRes val icon: Int) {
    object Setting : MenuAction(R.string.setting, R.drawable.setting_button_24)
}
