package com.pocketqueens.motivateyourself

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.pocketqueens.motivateyourself.ui.theme.MotivateYourselfTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MotivateYourselfTheme {
        Column {
            TopAppBar(
                title = {
                    Text(text = "Motivate Calendar")
                },
                backgroundColor = Color.White,
                navigationIcon = {
                    IconButton(onClick = {

                    }) {
                        Icon(Icons.Filled.Menu, "Test")
                    }
                }
            )
        }
    }
}
