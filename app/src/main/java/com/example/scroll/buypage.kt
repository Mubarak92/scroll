package com.example.scroll

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.drawable.toDrawable
import kotlinx.android.synthetic.main.activity_buypage.view.*


//lateinit var binding: ActivityBuypageBinding
class buypage : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = ActivityBuypageBinding.inflate(layoutInflater)
//        setContentView(binding.root)

        setContentView(R.layout.activity_buypage)


        val intent = intent
        val name = intent.getStringExtra("phoneName")
        val descript = intent.extras?.getString("PhoneDescript")
        val image = intent.extras?.getInt("phoneImage")
//

        val name1 = findViewById<TextView>(R.id.buy_name).apply { text = " $name " }
        val descript1 = findViewById<TextView>(R.id.buy_descript).apply { text = "$descript" }
        val image1 = findViewById<ImageView>(R.id.buy_image).apply {
            if (image != null) {
                setImageResource(image)
            }
        }


    }

}