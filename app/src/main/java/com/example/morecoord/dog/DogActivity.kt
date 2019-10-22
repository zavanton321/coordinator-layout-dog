package com.example.morecoord.dog

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import com.example.morecoord.R
import kotlinx.android.synthetic.main.activity_dog.*

class DogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dog)

        setSupportActionBar(vToolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.dog_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
}
