package com.example.animals.data

import com.example.animals.R
import com.example.animals.model.Animal

class Datasource {

    // return list of data
    fun loadAnimals(): List<Animal>{
        return listOf(
            Animal(R.string.cat,R.string.cat_type,R.drawable.cat2_removebg_preview) ,
            Animal(R.string.lion,R.string.lion_type,R.drawable.lion_removebg_preview),
            Animal(R.string.crocodile,R.string.crocodile_type,R.drawable.crocodile3_removebg_preview)


        )
    }
}