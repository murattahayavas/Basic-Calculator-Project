package com.example.objectorientedprogramming.repository

interface IHesapMakinesi {
    fun topla(sayi1: Int=0, sayi2: Int=0): Int
    fun cikar(sayi1: Int=0, sayi2: Int=0): Int
    fun carp(sayi1: Int=0,  sayi2: Int=0): Int
    fun bol(sayi1:Double, b: Double): Double

}