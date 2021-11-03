package com.example.scroll.data

import com.example.scroll.R
import com.example.scroll.model.Scroll

class Datasource {
    fun loadScroll():List<Scroll>{
        return listOf<Scroll>(
            Scroll(R.string.month1,R.drawable.january),
            Scroll(R.string.month2,R.drawable.feb),
            Scroll(R.string.month3, R.drawable.march),
            Scroll(R.string.month4, R.drawable.april),
            Scroll(R.string.month5, R.drawable.may),
            Scroll(R.string.month6, R.drawable.june),
            Scroll(R.string.month7, R.drawable.july),
            Scroll(R.string.month8, R.drawable.augest),
            Scroll(R.string.month9, R.drawable.september),
            Scroll(R.string.month10, R.drawable.october),
            Scroll(R.string.month11, R.drawable.november),
            Scroll(R.string.month12, R.drawable.december)

        )
    }
}