package com.example.objectorientedprogramming.presente.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.objectorientedprogramming.presente.navigation.Router
import com.example.objectorientedprogramming.repository_impl.HesapMakinesiImpl
import com.example.objectorientedprogramming.use_case.BolUseCase
import com.example.objectorientedprogramming.use_case.CarpUseCase
import com.example.objectorientedprogramming.use_case.CikarUseCase
import com.example.objectorientedprogramming.use_case.ToplaUseCase

@Composable
fun CalculateScreen(navController: NavController) {
    
    val sayi1 = remember { mutableStateOf("") }
    val sayi2 = remember { mutableStateOf("") }
    val sonuc = remember { mutableDoubleStateOf(0.0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF0F0F0))
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Calculator",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF6200EE)
        )

        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            value = sayi1.value,
            onValueChange = { sayi1.value = it },
            label = { Text("Number 1") },
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White, RoundedCornerShape(8.dp))
        )

        Spacer(modifier = Modifier.height(8.dp))

        TextField(
            value = sayi2.value,
            onValueChange = { sayi2.value = it },
            label = { Text("Number 2") },
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White, RoundedCornerShape(8.dp))
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                onClick = {
                    val yeniDeger = toplaUseCase(sayi1 = sayi1.value.toInt(), sayi2 = sayi2.value.toInt())
                    sonuc.doubleValue = yeniDeger.toDouble()
                },
                modifier = Modifier.size(64.dp)
            ) {
                Text(text = "+", fontSize = 24.sp)
            }
            Button(
                onClick = {
                    val yeniDeger = cikarUseCase(sayi1 = sayi1.value.toInt(), sayi2 = sayi2.value.toInt())
                    sonuc.doubleValue = yeniDeger.toDouble()
                },
                modifier = Modifier.size(64.dp)
            ) {
                Text(text = "-", fontSize = 24.sp)
            }
            Button(
                onClick = {
                    val yeniDeger = carpUseCase(sayi1 = sayi1.value.toInt(), sayi2 = sayi2.value.toInt())
                    sonuc.doubleValue = yeniDeger.toDouble()
                },
                modifier = Modifier.size(64.dp)
            ) {
                Text(text = "*", fontSize = 24.sp)
            }
            Button(
                onClick = {
                    val yeniDeger = bolUseCase(sayi1 = sayi1.value.toDouble(), sayi2 = sayi2.value.toDouble())
                    sonuc.doubleValue = yeniDeger
                },
                modifier = Modifier.size(64.dp)
            ) {
                Text(text = "/", fontSize = 24.sp)
            }
        }

        Spacer(modifier = Modifier.height(16.dp))




        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { navController.navigate(Router.Result(result = sonuc.doubleValue.toFloat())) },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Calculate")
        }
    }
}

@Preview
@Composable
fun CalculateScreenPreview() {
    CalculateScreen(navController = NavController(LocalContext.current))
}
