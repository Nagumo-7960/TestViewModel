package com.example.testviewmodel

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Screen()
            }
        }
    }
}

@Composable
fun Screen() {
    var favoriteState by remember { mutableStateOf(false) }
    Log.d("favorite", favoriteState.toString())
    if (favoriteState) {
        FavoriteButton(favoriteState){
            favoriteState = false
            Log.d("favorite", favoriteState.toString())
        }
    } else {
        NonFavoriteButton(favoriteState, onClick = {
            favoriteState = true
            Log.d("favorite", favoriteState.toString())
        })
    }
}

@Composable
fun NonFavoriteButton(favoriteState: Boolean, onClick: () -> Unit) {
    var favoriteState = false
    Button(
        onClick = onClick,
        contentPadding = PaddingValues(
            start = 20.dp,
            top = 12.dp,
            end = 20.dp,
            bottom = 12.dp
        ),

        shape = RoundedCornerShape(20.dp),
        colors = ButtonDefaults.textButtonColors(
            backgroundColor = Color.White,
            contentColor = Color.Gray
        )
    ) {
        Icon(
            Icons.Filled.Star,
            contentDescription = "Favorite",
            modifier = Modifier.size(50.dp)
        )
        Spacer(Modifier.size(ButtonDefaults.IconSpacing))
        Text(
            "???????????????",
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun FavoriteButton(favoriteState: Boolean, onClick:()->Unit) {
    Button(
        onClick = onClick,
        contentPadding = PaddingValues(
            start = 20.dp,
            top = 12.dp,
            end = 20.dp,
            bottom = 12.dp
        ),

        shape = RoundedCornerShape(20.dp),
        colors = ButtonDefaults.textButtonColors(
            backgroundColor = Color.Cyan,
            contentColor = Color.White
        )
    ) {
        Icon(
            Icons.Filled.Star,
            contentDescription = "Favorite",
            modifier = Modifier.size(50.dp)
        )
        Spacer(Modifier.size(ButtonDefaults.IconSpacing))
        Text(
            "???????????????",
            fontWeight = FontWeight.Bold
        )
    }
}

//@Preview
//@Composable
//fun PreviewNonFavoriteButton() {
//    var favoriteState = false
//    NonFavoriteButton(favoriteState)
//}
//
//@Preview
//@Composable
//fun PreviewFavoriteButton() {
//    var favoriteState = false
//    FavoriteButton(favoriteState)
//}