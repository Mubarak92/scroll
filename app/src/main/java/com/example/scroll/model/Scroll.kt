package com.example.scroll.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Scroll(
    @StringRes val stringId: Int, val imageId: Int, val companyId: Int, val descript: Int, val wishlistId: Boolean, val quanityId: Int,val isVipId:Boolean
) {
}
