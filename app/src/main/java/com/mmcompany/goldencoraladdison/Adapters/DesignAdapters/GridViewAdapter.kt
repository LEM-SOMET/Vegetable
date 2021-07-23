package com.mmcompany.goldencoraladdison.Adapters.DesignAdapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mmcompany.goldencoraladdison.MainActivity
import com.mmcompany.goldencoraladdison.Models.MenuGridModel
import com.mmcompany.goldencoraladdison.R
import com.mmcompany.goldencoraladdison.Screens.DetailproductActivity
import com.mmcompany.goldencoraladdison.Screens.Fragments.HomeActivityFrag
import com.mmcompany.goldencoraladdison.databinding.SingleCardMenuGridBinding


class GridViewAdapter(menuScreenGride: HomeActivityFrag, gridList: ArrayList<MenuGridModel>) : RecyclerView.Adapter<GridAdapter>() {
    var gridList = ArrayList<MenuGridModel>()
    var context: Context? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridAdapter {
        var binding1 = SingleCardMenuGridBinding.inflate(LayoutInflater.from(context),parent,false)
        var adapter =  GridAdapter(binding1)
        return  adapter
    }

    override fun onBindViewHolder(holder: GridAdapter, position: Int) {
        var getList: MenuGridModel = gridList.get(position)
        holder.binding.image.setImageResource(getList.image)
        holder.binding.tvCategory.setText(getList.menuName)
        holder.binding.image.setOnClickListener(View.OnClickListener {
            if (gridList.get(position).menuName.equals("Vegetables")){
                var intent = Intent(context,MainActivity::class.java).apply {  }
                context?.startActivity(intent)
            }
        })
    }

    override fun getItemCount(): Int {
        return gridList.size
    }
}

class GridAdapter(itemView: SingleCardMenuGridBinding) : RecyclerView.ViewHolder(itemView.root){
    var binding = itemView
}
