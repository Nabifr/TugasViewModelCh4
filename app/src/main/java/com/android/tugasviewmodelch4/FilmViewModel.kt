package com.android.tugasviewmodelch4

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FilmViewModel : ViewModel() {
    val list = arrayListOf(
        DataFilm("Andai Kau Tahu", "04-10-2023", R.drawable.img),
        DataFilm("Bermalas Malasan", "27-02-2023", R.drawable.img_1),
        DataFilm("Hidayah", "10-04-2023", R.drawable.hidayah),
        DataFilm("Pelajar Kampus", "10-11-2017", R.drawable.pelajar),
        DataFilm("Jangan Menyerah", "10-11-2017", R.drawable.jangan)
    )

    val filmList : MutableLiveData<List<DataFilm>> = MutableLiveData()

    fun getFilmList(){
        filmList.value = list
    }

}