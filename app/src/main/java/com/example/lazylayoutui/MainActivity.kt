package com.example.lazylayoutui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.lazylayoutui.ui.theme.LazyLayoutUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyLayoutUITheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    LazyLayout()
                }
            }
        }
    }
}

@Composable
fun LazyLayout() {
    Column(
        Modifier
            .fillMaxSize()
            .background(colorResource(R.color.bg_black))
    ) {

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LazyLayoutUITheme {
        LazyLayout()
    }
}