package com.example.scroll.data

import com.example.scroll.R
import com.example.scroll.model.Scroll

class Datasource {
    fun loadScroll():List<Scroll>{
        return listOf<Scroll>(
            Scroll(R.string.product1,R.drawable.iphone13,R.drawable.apple_logo,R.string.descript1,true,8,true),
            Scroll(R.string.product2,R.drawable.iphone12,R.drawable.apple_logo,R.string.descript2,false,5,false),
            Scroll(R.string.product3, R.drawable.huawei_1, R.drawable.ni,R.string.descript3,true,0,true),
            Scroll(R.string.product4, R.drawable.ult,R.drawable.samsung_log,R.string.descript4,false,0,false),
            Scroll(R.string.product5, R.drawable.huawei_y6,R.drawable.huawei_logo,R.string.descript5,true,70,true),
            Scroll(R.string.product6, R.drawable.galaxyfold,R.drawable.samsung_log,R.string.descript6,true,36,true),

        )
    }
}