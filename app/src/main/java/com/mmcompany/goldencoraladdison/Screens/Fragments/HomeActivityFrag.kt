package com.mmcompany.goldencoraladdison.Screens.Fragments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.get
import androidx.recyclerview.widget.GridLayoutManager
import com.mmcompany.goldencoraladdison.Adapters.DesignAdapters.GridViewAdapter
import com.mmcompany.goldencoraladdison.MainActivity
import com.mmcompany.goldencoraladdison.Models.MenuGridModel
import com.mmcompany.goldencoraladdison.R
import com.mmcompany.goldencoraladdison.databinding.FragmentHomeActivityBinding


class HomeActivityFrag : Fragment() {
     lateinit var binding : FragmentHomeActivityBinding
    var getList = ArrayList<MenuGridModel>()
    var adapter: GridViewAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getList.clear()
        getList.add(MenuGridModel("Vegetables",R.drawable.vegetableico))
        getList.add(MenuGridModel("Fruits",R.drawable.fruitico))
        getList.add(MenuGridModel("Meats",R.drawable.meats))
        getList.add(MenuGridModel("Things",R.drawable.vegetlogo))
        getList.add(MenuGridModel("Things",R.drawable.vegetlogo))
        getList.add(MenuGridModel("Things",R.drawable.vegetlogo))

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeActivityBinding.inflate(inflater)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.recyclerviewGridMenu.setHasFixedSize(true)
        var gridViewAdapter: GridViewAdapter= GridViewAdapter(this,getList)
        gridViewAdapter.context = context
        binding.recyclerviewGridMenu.setLayoutManager(GridLayoutManager(context,3))
        gridViewAdapter.gridList = getList
        binding.recyclerviewGridMenu.adapter = gridViewAdapter

    }
}