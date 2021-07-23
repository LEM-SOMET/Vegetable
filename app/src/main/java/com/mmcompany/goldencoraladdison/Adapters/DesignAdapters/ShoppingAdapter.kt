package com.mmcompany.goldencoraladdison.Adapters.DesignAdapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.mmcompany.goldencoraladdison.Models.ShoppingMode
import com.mmcompany.goldencoraladdison.R
import com.mmcompany.goldencoraladdison.Screens.DetailproductActivity
import com.mmcompany.goldencoraladdison.Screens.Fragments.ShopFragment
import com.mmcompany.goldencoraladdison.databinding.CustomItemShoppingBinding

class ShoppingAdapter(shopFragment: ShopFragment, listItem: ArrayList<ShoppingMode>) : RecyclerView.Adapter<ShopAdapter>() {
    var context: Context? = null
    var shopList = ArrayList<ShoppingMode>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShopAdapter {
        var binding1 = CustomItemShoppingBinding.inflate(LayoutInflater.from(context),parent,false)
        var adapter = ShopAdapter(binding1)
        return adapter
    }

    override fun onBindViewHolder(holder: ShopAdapter, position: Int) {
        var dataseter: ShoppingMode = shopList.get(position)
        holder.binding.imageItemshop.setImageResource(dataseter.image)
        holder.binding.tvItemName.setText(dataseter.name)
        holder.binding.tvDiscount.setText("${dataseter.dis}%")
        holder.binding.tvItemPrice.setText("$${dataseter.price}")
        holder.binding.itemCard.setOnClickListener(View.OnClickListener {
            var intent = Intent (context,DetailproductActivity::class.java).apply {
                Toast.makeText(context,"${dataseter.name}",Toast.LENGTH_LONG).show()
            }
            context?.startActivity(intent)
        })
    }

    override fun getItemCount(): Int {
       return shopList.size
    }
}

class ShopAdapter (itemView: CustomItemShoppingBinding):RecyclerView.ViewHolder(itemView.root){
    var binding = itemView
}

