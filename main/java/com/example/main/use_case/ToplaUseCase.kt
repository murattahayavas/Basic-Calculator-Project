package com.example.objectorientedprogramming.use_case

import com.example.objectorientedprogramming.repository_impl.HesapMakinesiImpl

class ToplaUseCase {//bunun amacı sadece bu metodu kullandırpı security sağlamak
    private val hesapMakinesiImpl= HesapMakinesiImpl()
    operator fun invoke(sayi1:Int,sayi2:Int):Int{
        return hesapMakinesiImpl.topla(sayi1,sayi2)

    }
}