package com.example.manuel

import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.fragment.app.Fragment

class ViewPagerAdapter(supportFragmentManager: FragmentManager):
   FragmentStatePagerAdapter(supportFragmentManager) {

    //Declare arrayList to contain fragments and its title
    private  var mFragmentList=ArrayList<Fragment>()
    private  var mFragmentTitleList = ArrayList<String>()

    override fun getItem(position: Int): Fragment {
        return mFragmentList[position]
    }

    override fun getCount(): Int {
        return mFragmentList.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return mFragmentTitleList[position]
    }

    fun addFragment(fragment: Fragment, title: String) {
        mFragmentList.add(fragment)
        mFragmentTitleList.add(title)
    }

}