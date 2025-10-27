package com.example.models_2025

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen() {
    Column (
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ){
        Text(text = "My name is Maryis Perozo")
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "image"
        )

    }
    Box {
        FooterBar()
    }
}

@Composable
fun FooterBar() {
    Row {
        Item()
        Item()
        Item()
    }
}

@Composable
fun Item() {
    Box(){}
}

