package com.example.models_2025

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.models_2025.ui.theme.Models_2025Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Models_2025Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HomeScreen()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier,
        fontSize = 24.sp,
        textAlign = TextAlign.Center
    )
}

@Composable
fun Home() {
    Box(
        modifier = Modifier
            .fillMaxSize(),
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly
        ){
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(height = 20.dp)
                    .border(width = 3.dp, color = Color.Black),
            ){}
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(height = 40.dp)
                    .border(width = 3.dp, color = Color.Black),
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                Column(modifier = Modifier.border(width = 1.dp, color = Color.Red)){
                    Text(text = "1",)
                    Text(text = "2",)
                }
                Column(modifier = Modifier.border(width = 1.dp, color = Color.Black)){
                    Text(text = "3",)
                    Text(text = "4",)
                }
                Column (modifier = Modifier.border(width = 1.dp, color = Color.Black)){
                    Text(text = "5",)
                    Text(text = "6",)
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(height = 20.dp)
                    .border(width = 3.dp, color = Color.Black),
            ){}
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    Models_2025Theme {
        HomeScreen()
    }
}


//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    Models_2025Theme {
//        Greeting("Android" +
//                "!")
//   }
//}