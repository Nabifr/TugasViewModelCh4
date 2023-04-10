package com.android.tugasviewmodelch4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.android.tugasviewmodelch4.databinding.ActivityFilmBinding

class FilmActivity : AppCompatActivity() {
    lateinit var filmVm : FilmViewModel
    lateinit var filmAdapter : FilmAdapter
    lateinit var binding: ActivityFilmBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilmBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initfilm()
        filmVm = ViewModelProvider(this).get(FilmViewModel::class.java)
        filmVm.getFilmList()

        filmVm.filmList.observe(this, Observer {
            filmAdapter.setFilmData(it as ArrayList<DataFilm>)
        })
    }

    fun initfilm () {
        filmAdapter = FilmAdapter(ArrayList())
        binding.rvFilm.layoutManager = GridLayoutManager(this, 2)
        binding.rvFilm.adapter = filmAdapter
    }
}