package com.example.objectorientedprogramming.use_case

import com.example.objectorientedprogramming.repository_impl.HesapMakinesiImpl

class CikarUseCase {
    private val hesapMakinesiImpl = HesapMakinesiImpl()

    operator fun invoke(sayi1: Int, sayi2: Int): Int {
        return hesapMakinesiImpl.cikar(sayi1, sayi2)
    }
}