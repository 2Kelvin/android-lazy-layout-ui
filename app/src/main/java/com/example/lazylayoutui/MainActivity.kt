package com.example.lazylayoutui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material.icons.sharp.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.LinearGradient
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
        // column icon
        Column(
            Modifier
                .fillMaxWidth()
                .padding(top = 10.dp, end = 15.dp),
            horizontalAlignment = Alignment.End
        ) {
            Icon(
                imageVector = Icons.Rounded.Settings,
                contentDescription = null,
                modifier = Modifier.size(28.dp),
                tint = Color.White
            )
        }
        // column profile & bio
        Column(
            Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val linearGradientBrush = Brush.linearGradient(
                colors = listOf(colorResource(R.color.my_red), colorResource(R.color.orange)),
                start = Offset.Infinite,
                end = Offset.Zero
            )

            Card(
                shape = CircleShape,
                backgroundColor = colorResource(R.color.bg_black),
                modifier = Modifier.border(2.dp, linearGradientBrush, CircleShape)
            ) {
                Image(
                    painter = painterResource(R.drawable.laughm),
                    contentDescription = "profile",
                    modifier = Modifier
                        .padding(10.dp)
                        .clip(CircleShape)
                        .size(85.dp)
                )
            }
            Text(
                text = "Chris Orenga",
                fontSize = 30.sp,
                modifier = Modifier.padding(top = 7.dp),
                color = Color.White
            )
            Text(
                text = "Member since July 23rd, 2018",
                color = colorResource(R.color.fade_text),
                fontSize = 16.sp,
                modifier = Modifier.padding(bottom = 7.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LazyLayoutPreview() {
    LazyLayoutUITheme {
        LazyLayout()
    }
}