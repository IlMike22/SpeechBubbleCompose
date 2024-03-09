package com.example.customshapescompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.customshapescompose.ui.theme.CustomShapesComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CustomShapesComposeTheme {
                Box(
                    modifier = Modifier
                        .clip(CircleShape)
                )

            }
        }
    }
}

@Preview
@Composable
fun SpeechBubbleShapesTheme() {
    Box(
        modifier = Modifier
            .size(200.dp)
            .clip(SpeechBubbleShape())
            .background(Color.Red)
    ) {
        Text(
            text = "Hello world",
            modifier = Modifier.offset(x = 20.dp, y = 2.dp)
        )
    }
}