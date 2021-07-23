package com.mmcompany.goldencoraladdison.Screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.mmcompany.goldencoraladdison.Adapters.DesignAdapters.GridViewAdapter
import com.mmcompany.goldencoraladdison.Models.MenuGridModel
import com.mmcompany.goldencoraladdison.R
import com.mmcompany.goldencoraladdison.Screens.Fragments.HomeActivityFrag
import com.mmcompany.goldencoraladdison.Screens.Fragments.PersonalFragment
import com.mmcompany.goldencoraladdison.Screens.Fragments.ShopFragment
import com.mmcompany.goldencoraladdison.databinding.ActivityHomeScreenBinding

class MenuScreenGride : AppCompatActivity() {
    private lateinit var binding: ActivityHomeScreenBinding
//    var getList = ArrayList<MenuGridModel>()
//    var adapter: GridViewAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_home_screen)

        var homFragment  = HomeActivityFrag()
        var shopFragment = ShopFragment()
        var personal = PersonalFragment()
        setCurrentFragment(homFragment)


        binding.bottomNavigations.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home->setCurrentFragment(homFragment)
                R.id.shop->setCurrentFragment(shopFragment)
                R.id.peronal->setCurrentFragment(personal)
            }
            true
        }
    }
    private fun setCurrentFragment(fragment:Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.homeFragment,fragment)
            commit()
        }
}
