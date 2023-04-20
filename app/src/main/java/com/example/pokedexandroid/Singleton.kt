package com.example.pokedexandroid

object Singleton {
    val citiesArray = ArrayList<City>()
    init{
        citiesArray.add(City("Curitiba", 3000000))
        citiesArray.add(City("São Paulo", 20000000))
        citiesArray.add(City("Rio de Janeiro", 10000000))
        citiesArray.add(City("Colombo", 300000))
        citiesArray.add(City("Almirante Tamandaré", 200000))
    }
}