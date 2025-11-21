package com.example.ap20

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ap20.ui.theme.AP20Theme
import android.view.View


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        findViewById<View>(R.id.Question) .setOnClickListener { findViewById<View>(R.id.Question) .visibility=View.INVISIBLE
        findViewById<View>(R.id.Reponse) .visibility = View.VISIBLE
        }

        findViewById<View>(R.id.Reponse) .setOnClickListener {
            findViewById<View>(R.id.Question) .visibility = View.VISIBLE
            findViewById<View>(R.id.Reponse) .visibility = View.INVISIBLE
        }

        setContent {
            AP20Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
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
    AP20Theme {
        Greeting("Android")
    }
}