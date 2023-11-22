package com.example.listapeliculas

import android.content.Intent
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity

open class ActivityWithMenus : AppCompatActivity() {
    companion object{
        var actividadActual = 0
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
            inflater.inflate(R.menu.menu_pelis,menu)

        for (i in 0 until menu.size()) {
            if (i == actividadActual) menu.getItem(i).isEnabled = false
            else menu.getItem(i).isEnabled = true
        }

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.listadoPelis -> {
                val intent = Intent(this, MainActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                actividadActual = 0
                startActivity(intent)
                true
            }
            R.id.addPeli -> {
                val intent = Intent(this, AnnadirPelicula::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                actividadActual = 1
                startActivity(intent)
                true
            }
            R.id.appPeli -> {
                val intent = Intent(this, AppPelis::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                actividadActual = 2
                startActivity(intent)
                true
            }
            R.id.salir -> {
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}