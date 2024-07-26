package com.example.objectorientedprogramming.use_case

import com.example.objectorientedprogramming.repository_impl.HesapMakinesiImpl

class BolUseCase {
    private val hesapMakinesiImpl=HesapMakinesiImpl()
    operator fun invoke(sayi1:Double,sayi2:Double):Double{
        return hesapMakinesiImpl.bol(sayi1,sayi2)

    }
}