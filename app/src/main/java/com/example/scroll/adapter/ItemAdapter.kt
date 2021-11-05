package com.example.scroll.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.example.scroll.R
import com.example.scroll.model.Scroll


class ItemAdapter(
    private val context: Context, private val dataset: List<Scroll>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {


    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.months)
        val textView2: TextView = view.findViewById(R.id.textView)
        val imageView2: ImageView = view.findViewById(R.id.logo)

         val rating: RatingBar = view.findViewById(R.id.rb_ratingBar)
        val wishlist: CheckBox = view.findViewById(R.id.wishlist)// a Quation here
        val buy: Button = view.findViewById(R.id.button)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringId)
        holder.textView2.text = context.resources.getString(item.descript)
        holder.imageView.setImageResource(item.imageId)
        holder.imageView2.setImageResource(item.companyId)

        holder.buy.setOnClickListener {
            if (item.quanityId != 0) {
                Toast.makeText(holder.buy.context, "Available", Toast.LENGTH_SHORT).show()

            } else {
                Toast.makeText(holder.buy.context, "Out of Stock", Toast.LENGTH_SHORT).show()
            }
        }
            holder.wishlist.setOnCheckedChangeListener { buttonView, isChecked ->
                if (item.wishlistId == isChecked){
                    Toast.makeText(holder.wishlist.context, "added to wish list", Toast.LENGTH_SHORT).show()
            }else{
                    Toast.makeText(holder.wishlist.context, "removed from wish list", Toast.LENGTH_SHORT).show()
                }
        }

//                if (item.wishlistId){
//                    Toast.makeText(holder.wishlist.context, "added to wish list", Toast.LENGTH_SHORT).show()
//            }else{
//                    Toast.makeText(holder.wishlist.context, "removed from wish list", Toast.LENGTH_SHORT).show()
//                }
//        }

//holder.rating.setOnRatingBarChangeListener { ratingBar, rating, fromUser ->
//    Toast.makeText(this,"Rating $rating",Toast.LENGTH_SHORT)






    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}





