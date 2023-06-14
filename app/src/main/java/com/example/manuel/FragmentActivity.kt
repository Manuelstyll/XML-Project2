package com.example.manuel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.Tab

class FragmentActivity : AppCompatActivity() {

    private lateinit var pager:ViewPager
    private lateinit var tab:TabLayout
    private lateinit var bar:androidx.appcompat.widget.Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        pager = findViewById(R.id.viewPager)
        tab = findViewById(R.id.tabs)
        bar = findViewById(R.id.toolbar)

        setSupportActionBar(bar)

        //Initialising the ViewPageAdapter
        var adapter = ViewPagerAdapter(supportFragmentManager)

        //add fragment to the list
        adapter.addFragment(SignUpFragment(), "Signup")
        adapter.addFragment(LoginFragment(), "Login")
        adapter.addFragment(HomeFragment(), "Home")

        //Adding the Adapter to the ViewPager
         pager.adapter = adapter

        //Bind the ViewPager with the TabLayout
        tab.setupWithViewPager(pager)

    }
}