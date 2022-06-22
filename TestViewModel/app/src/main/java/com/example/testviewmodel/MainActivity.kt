package com.example.testviewmodel

import android.os.Bundle
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
import androidx.compose.runtime.Composable
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
                NonFavoriteButton()
            }
        }
    }
}


@Composable
fun NonFavoriteButton() {
    Button(
        onClick = {

        },
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
            "お気に入り",
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun FavoriteButton() {
    Button(
        onClick = {

        },
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
            "お気に入り",
            fontWeight = FontWeight.Bold
        )
    }
}

@Preview
@Composable
fun PreviewNonFavoriteButton() {
    NonFavoriteButton()
}

@Preview
@Composable
fun PreviewFavoriteButton() {
    FavoriteButton()
}