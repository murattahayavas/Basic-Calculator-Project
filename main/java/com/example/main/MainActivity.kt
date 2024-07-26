package com.example.objectorientedprogramming

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.Navigation
import com.example.objectorientedprogramming.navigation.Navigation
import com.example.objectorientedprogramming.ui.theme.ObjectOrientedProgrammingTheme
import com.example.objectorientedprogramming.presente.views.CalculateScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ObjectOrientedProgrammingTheme {
                Navigation()
            }
        }
    }
}
