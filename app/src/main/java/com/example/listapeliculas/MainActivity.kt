package com.example.listapeliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listapeliculas.FilmProvider.Companion.filmList
import com.example.listapeliculas.adapter.FilmAdapter
import com.example.listapeliculas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //val decoration = DividerItemDecoration(this, LinearLayoutManager.VERTICAL)
        //val manager = GridLayoutManager(this,2)

        binding.recycler.layoutManager = LinearLayoutManager(this)
        //binding.recycler.layoutManager = manager
        binding.recycler.adapter = FilmAdapter(FilmProvider.filmList)
        //binding.recycler.addItemDecoration(decoration)
    }
}