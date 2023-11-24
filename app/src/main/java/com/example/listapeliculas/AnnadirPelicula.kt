package com.example.listapeliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listapeliculas.databinding.ActivityAnnadirPeliculaBinding

class AnnadirPelicula : ActivityWithMenus() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_annadir_pelicula)
        val binding = ActivityAnnadirPeliculaBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}