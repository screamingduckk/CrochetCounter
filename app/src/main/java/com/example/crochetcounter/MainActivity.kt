package com.example.crochetcounter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.crochetcounter.ui.theme.CrochetCounterTheme
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CrochetCounterTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}


@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Column (modifier = Modifier.fillMaxSize() .wrapContentSize(Alignment.Center)) {
        var currentStitchCount by remember { mutableIntStateOf(0) }
        var currentSetCount by remember { mutableIntStateOf(0) }
        var currentRowCount by remember { mutableIntStateOf(0) }
        var targetSetCount by remember { mutableIntStateOf(0) }

        Text(
        text = "Stitch Count: $currentStitchCount",
        modifier = modifier.fillMaxWidth(),
        fontSize = 30.sp,
        textAlign = TextAlign.Center,
        color = androidx.compose.ui.graphics.Color.DarkGray
        )

        Row (modifier = Modifier.padding(horizontal = 8.dp, vertical = 8.dp).fillMaxWidth(),horizontalArrangement = Arrangement.SpaceEvenly) {
           Button(onClick = { currentStitchCount++ }, Modifier.height(80.dp) .width(160.dp)) {
                Text("+ Add", fontSize = 24.sp)
               Color.
            }
            FilledTonalButton(onClick = { currentStitchCount = 0 }, Modifier.height(80.dp) .width(160.dp)) {
                Text("Reset", fontSize = 24.sp)
            }
        }

        Text(
            text = "Set Count: $currentSetCount",
            modifier = modifier.fillMaxWidth(),
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
            color = androidx.compose.ui.graphics.Color.LightGray
        )
        Row (modifier = Modifier.padding(horizontal = 8.dp, vertical = 8.dp).fillMaxWidth(),horizontalArrangement = Arrangement.SpaceEvenly) {
            FilledTonalButton(onClick = { currentSetCount++ }, Modifier.padding(horizontal = 8.dp)) {
                Text("+ Add")
            }
            OutlinedButton(onClick = { currentSetCount = 0 }, Modifier.padding(horizontal = 8.dp)) {
                Text("Reset")
            }
        }
        Text(
            text = "Row Count: $currentRowCount",
            modifier = modifier.fillMaxWidth(),
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
            color = androidx.compose.ui.graphics.Color.LightGray
        )
        Row (modifier = Modifier.padding(horizontal = 8.dp, vertical = 8.dp).fillMaxWidth(),horizontalArrangement = Arrangement.SpaceEvenly){
            FilledTonalButton(onClick = { currentRowCount++ }, Modifier.padding(horizontal = 8.dp)) {
                Text("+ Add")
            }
            OutlinedButton(onClick = { currentRowCount = 0 }, Modifier.padding(horizontal = 8.dp)) {
                Text("Reset")
            }
        }

    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CrochetCounterTheme {
        Greeting()
    }
}