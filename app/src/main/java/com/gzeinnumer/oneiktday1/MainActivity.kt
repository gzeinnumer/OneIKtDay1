package com.gzeinnumer.oneiktday1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.viewbinding.library.activity.viewBinding
import com.gzeinnumer.oneiktday1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

//    private val binding: ActivityMainBinding by viewBinding()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}