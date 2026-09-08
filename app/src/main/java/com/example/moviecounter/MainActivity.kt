package com.example.moviecounter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.FloatingActionButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.moviecounter.ui.theme.MovieCounterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MovieCounterTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ComponentsExample(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun ComponentsExample(modifier: Modifier = Modifier) {
    val checkedState = remember { mutableStateOf(true) }

    Column(modifier = modifier.padding(16.dp)) {
        // Componente 1: Card
        Card(modifier = Modifier.padding(bottom = 16.dp)) {
            Text(text = "Componente Card", modifier = Modifier.padding(16.dp))
        }

        // Componente 2: Switch
        Switch(
            checked = checkedState.value,
            onCheckedChange = { checkedState.value = it },
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // Componente 3: FloatingActionButton
        FloatingActionButton(onClick = { }) {
            Text(text = "+", modifier = Modifier.padding(16.dp))
        }
    }
}