package com.example.objectorientedprogramming.use_case

import com.example.objectorientedprogramming.repository_impl.HesapMakinesiImpl

class CarpUseCase {
    private val hesapMakinesiImpl = HesapMakinesiImpl()

    operator fun invoke(sayi1: Int, sayi2: Int):Int{
    return hesapMakinesiImpl.carp(sayi1,sayi2)

    }
}