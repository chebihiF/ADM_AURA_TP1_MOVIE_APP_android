package org.m2i.tp1_movie_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.m2i.tp1_movie_app.ui.theme.TP1_MOVIE_APPTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                MainContent(PaddingValues(all = 10.dp))
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyApp(content: @Composable (paddingValues: PaddingValues) -> Unit){ // Unit = void
    TP1_MOVIE_APPTheme {
        Scaffold(topBar = {
            TopAppBar(
                title = { Text(text = "Movies") },
                colors = TopAppBarDefaults.largeTopAppBarColors(containerColor = Color.Cyan),

            )
        }, content = {innerPadding -> content(innerPadding)})
    }
}

@Composable
fun MainContent(innerPadding: PaddingValues){
    Surface(modifier=Modifier.padding(innerPadding), color = MaterialTheme.colorScheme.background) {
        Text(text = "Hello")
    }

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApp {
        MainContent(PaddingValues(all = 100.dp))
    }
}