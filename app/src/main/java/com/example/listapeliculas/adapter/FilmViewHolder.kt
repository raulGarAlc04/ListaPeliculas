package com.example.listapeliculas.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.listapeliculas.Film
import com.example.listapeliculas.databinding.ItemFilmBinding

class FilmViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val binding = ItemFilmBinding.bind(view)
    fun render(filmModel: Film) {
        binding.FilmName.text = filmModel.title
        binding.FilmDirector.text = filmModel.director
        binding.FilmYear.text = filmModel.year.toString()
        Glide.with(binding.FilmPhoto.context).load(filmModel.photo).into(binding.FilmPhoto)

        // Evento de hacer click sobre la imagen de la pelicula
        binding.FilmPhoto.setOnClickListener() {Toast.makeText(binding.FilmPhoto.context, filmModel.title,Toast.LENGTH_LONG).show()}

        // Evento de hacer clic sobre el elemento pelicula
        itemView.setOnClickListener() {Toast.makeText(binding.FilmPhoto.context, filmModel.year.toString(),Toast.LENGTH_LONG).show()}
    }



}