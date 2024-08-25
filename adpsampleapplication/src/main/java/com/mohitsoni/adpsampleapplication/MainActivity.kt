package com.mohitsoni.adpsampleapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mohitsoni.adp.*
import com.mohitsoni.adpsampleapplication.ui.theme.ADpTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        ADp.initializeAdp(this.resources, 360)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ADpTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { _ ->
                    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center, modifier = Modifier.fillMaxSize()) {
                        Text(
                            text = "This text uses sp\nDimensions to box are in dp",
                            fontSize = 16.sp,
                            modifier = Modifier
                                .background(
                                    Color.LightGray
                                )
                                .padding(vertical = 20.dp)
                                .width(300.dp)
                        )

                        Spacer(modifier = Modifier.height(20.aDp))

                        Text(
                            text = "This text uses aSp\nDimensions to box are in aDp",
                            fontSize = 16.aSp,
                            modifier = Modifier
                                .background(
                                    Color.LightGray
                                )
                                .padding(vertical = 20.aDp)
                                .width(300.aDp)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ADpTheme {
        Greeting("Android")
    }
}