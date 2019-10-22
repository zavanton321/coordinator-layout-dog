package com.example.morecoord.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.morecoord.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvDemo.setOnClickListener {
            Snackbar.make(vCoordinatorLayout, "Click", Snackbar.LENGTH_SHORT).show()
        }
    }
}
