package com.example.task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle



class DashBoardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)
        replaceFragment(MyHomeFragment())
    }

    private fun replaceFragment(myHomeFragment: MyHomeFragment) {

        var fragmentManager = supportFragmentManager
        var fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, myHomeFragment)
        fragmentTransaction.commit()
    }
}