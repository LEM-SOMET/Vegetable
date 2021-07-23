package com.mmcompany.goldencoraladdison.Screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mmcompany.goldencoraladdison.Adapters.VegetableAdapterAddtocart
import com.mmcompany.goldencoraladdison.Models.VegetablesModels
import com.mmcompany.goldencoraladdison.R
import com.mmcompany.goldencoraladdison.databinding.SinglCardAddtocartBinding

class AddtcartActivity : AppCompatActivity() {
    private lateinit var binding: SinglCardAddtocartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addtcart)
        var dataList2 = intent.getSerializableExtra("value") as ArrayList<VegetablesModels>

        var recyclerView1: RecyclerView = findViewById(R.id.recyclerview_add_to_cart)
        recyclerView1.setHasFixedSize(true)
        var dataListRecycle: VegetableAdapterAddtocart = VegetableAdapterAddtocart( this, dataList2)
        dataListRecycle.contaxt = this
        recyclerView1.setLayoutManager(LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false))
        dataListRecycle.list = dataList2
        recyclerView1.adapter = dataListRecycle
    }
}