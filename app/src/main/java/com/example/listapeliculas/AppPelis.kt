package com.example.listapeliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listapeliculas.databinding.ActivityAppPelisBinding

class AppPelis : ActivityWithMenus() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_app_pelis)
        val binding = ActivityAppPelisBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}