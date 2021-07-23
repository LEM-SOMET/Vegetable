package com.mmcompany.goldencoraladdison.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mmcompany.goldencoraladdison.Models.VegetablesModels
import com.mmcompany.goldencoraladdison.R
import com.mmcompany.goldencoraladdison.Screens.AddtcartActivity
import com.mmcompany.goldencoraladdison.databinding.SinglCardAddtocartBinding
import java.text.DecimalFormat

class VegetableAdapterAddtocart(
    addtcartActivity: AddtcartActivity,
    dataList1: ArrayList<VegetablesModels>
) : RecyclerView.Adapter<VegetAddtocart>() {
    var list= ArrayList<VegetablesModels>()
    var contaxt: Context? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VegetAddtocart {
        var binding2 = SinglCardAddtocartBinding.inflate(LayoutInflater.from(contaxt),parent,false)
        var ad1 = VegetAddtocart(binding2)
        return  ad1
    }

    override fun onBindViewHolder(holder: VegetAddtocart, position: Int) {
        var datasetter: VegetablesModels = list.get(position)
        val dec = DecimalFormat("#.00")
        holder.binding.imgVgetIdAddtocart.setImageResource(datasetter.v_img)
        holder.binding.tvVgetNameIdAddtocart.setText(datasetter.v_name)
        holder.binding.vCodeId.setText(datasetter.v_code)
        holder.binding.vQtyIdAddtocart.setText(datasetter.v_qty.toString())
        holder.binding.vPriceIdAddtocart.setText("$" + dec.format(datasetter.v_price))
        holder.binding.vTotalIdAddtocart.setText("$" + dec.format(datasetter.v_total))
    }

    override fun getItemCount(): Int {
        return list.size
    }
}

class VegetAddtocart(itemView: SinglCardAddtocartBinding): RecyclerView.ViewHolder(itemView.root){
    var binding = itemView
}
