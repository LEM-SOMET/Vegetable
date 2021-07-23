package com.mmcompany.goldencoraladdison.Screens.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.mmcompany.goldencoraladdison.Adapters.DesignAdapters.ShoppingAdapter
import com.mmcompany.goldencoraladdison.Models.ShoppingMode
import com.mmcompany.goldencoraladdison.R
import com.mmcompany.goldencoraladdison.databinding.FragmentShopBinding

class ShopFragment : Fragment() {

    lateinit var binding : FragmentShopBinding
    var listItem = ArrayList<ShoppingMode>()
    var grideAdapter: ShoppingAdapter? = null

    var getSelected: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        listItem.clear()
        listItem.add(ShoppingMode(R.drawable.katna,"Khatna",10.2,10,))
        listItem.add(ShoppingMode(R.drawable.carrot,"Carrot",10.2,10,))
        listItem.add(ShoppingMode(R.drawable.tomato,"Tomato",10.2,10,))
        listItem.add(ShoppingMode(R.drawable.onion,"Onion",10.2,10,))
        listItem.add(ShoppingMode(R.drawable.katna,"Khatna",10.2,10,))
        listItem.add(ShoppingMode(R.drawable.carrot,"Carrot",10.2,10,))
        listItem.add(ShoppingMode(R.drawable.tomato,"Tomato",10.2,10,))
        listItem.add(ShoppingMode(R.drawable.onion,"Onion",10.2,10,))
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.recyclerviewViewGrid.setHasFixedSize(true)
        var gridItemShopAdapter: ShoppingAdapter = ShoppingAdapter(this,listItem)
        gridItemShopAdapter.context = context
        binding.recyclerviewViewGrid.setLayoutManager(GridLayoutManager(context,2))
        gridItemShopAdapter.shopList = listItem
        binding.recyclerviewViewGrid.adapter = gridItemShopAdapter
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentShopBinding.inflate(inflater)
        return binding.root
    }
}