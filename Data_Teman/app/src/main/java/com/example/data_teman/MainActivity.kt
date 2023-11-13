package com.example.data_teman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val menuTask = arrayOf("Teman", "Github", "Profil")
    val menuIcon = arrayOf(R.drawable.house, R.drawable.add, R.drawable.profile)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ViewPagerAdapter(this)
        view_pager.setAdapter(adapter)
        TabLayoutMediator(Tab_Layout, view_pager,
        TabLayoutMediator.TabConfigurationStrategy{ tab, position->
        tab.text = menuTask[position]
        tab.icon = ResourcesCompat.getDrawable(resources, menuIcon[position], null)
        }).attach()
    }
}