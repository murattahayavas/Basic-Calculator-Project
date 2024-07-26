package com.example.objectorientedprogramming.presente.view_model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.objectorientedprogramming.use_case.BolUseCase
import com.example.objectorientedprogramming.use_case.CarpUseCase
import com.example.objectorientedprogramming.use_case.CikarUseCase
import com.example.objectorientedprogramming.use_case.ToplaUseCase

class CalculateScreenViewModel : ViewModel() {

    var sonuc = MutableLiveData<Double>()


    private val toplaUseCase = ToplaUseCase()
    private val cikarUseCase = CikarUseCase()
    private val carpUseCase = CarpUseCase()
    private val bolUseCase = BolUseCase()

    fun topla(sayi1: String, sayi2: String) {
        sonuc.value =toplaUseCase(sayi1.toInt(), sayi2.toInt()).toDouble()
    }

    fun cikar(sayi1: String, sayi2: String) {
        sonuc.value = cikarUseCase(sayi1.toInt(), sayi2.toInt()).toDouble()
    }

    fun carp(sayi1: String, sayi2: String) {
        sonuc.value = carpUseCase(sayi1.toInt(), sayi2.toInt()).toDouble()
    }

    fun bol(sayi1: String, sayi2: String) {
        sonuc.value = bolUseCase(sayi1.toDoubleOrNull() ?: 0.0, sayi2.toDoubleOrNull() ?: 1.0)
    }
}