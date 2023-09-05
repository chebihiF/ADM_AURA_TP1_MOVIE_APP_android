package org.m2i.tp1_movie_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
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
                MainContent()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyApp(content: @Composable () -> Unit){ // Unit = void
    TP1_MOVIE_APPTheme {
        Scaffold(
            topBar =
            {
                CenterAlignedTopAppBar(
                    title = { Text(text = "Movies") },
                    colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                        containerColor = Color.Magenta,
                        titleContentColor = Color.White,
                        navigationIconContentColor = Color.White,
                        actionIconContentColor = Color.White
                        ),
                    navigationIcon = { IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Filled.Menu, contentDescription = "Menu") } },
                    actions = {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(imageVector = Icons.Default.Add, contentDescription = "add") } }
                    )
            },
            bottomBar =
            {
                NavigationBar {
                    NavigationBarItem(
                        selected = true,
                        onClick = { /*TODO*/ },
                        icon = { Icon(imageVector = Icons.Default.Home, contentDescription = "Home") },
                        label = { Text(text = "Home")}
                    )

                    NavigationBarItem(
                        selected = true,
                        onClick = { /*TODO*/ },
                        icon = { Icon(imageVector = Icons.Default.Person, contentDescription = "Person") },
                        label = { Text(text = "Profile")}
                    )

                    NavigationBarItem(
                        selected = true,
                        onClick = { /*TODO*/ },
                        icon = { Icon(imageVector = Icons.Default.Favorite, contentDescription = "Favorite") },
                        label = { Text(text = "Favorite")}
                    )

                }
            },
            floatingActionButton =
            {
                FloatingActionButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Add, contentDescription = "Add")
                }
            }
        )
        { paddingValues ->
            Surface(modifier = Modifier.padding(paddingValues)){
                content()
            }
        }
    }
}

@Composable
fun MainContent(){
    Text(text = "Hello")
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApp {
        MainContent()
    }
}