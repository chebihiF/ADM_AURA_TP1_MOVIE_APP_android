package org.m2i.tp1_movie_app.screens.home

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import org.m2i.tp1_movie_app.model.Movie
import org.m2i.tp1_movie_app.model.getMovies
import org.m2i.tp1_movie_app.navigation.MovieScreens
import org.m2i.tp1_movie_app.widgets.MovieRow

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController){
    Scaffold(
        topBar =
        {
            CenterAlignedTopAppBar(
                title = { Text(text = "Movies") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = Color.White,
                    navigationIconContentColor = Color.White,
                    actionIconContentColor = Color.White
                ),
                navigationIcon = { IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Filled.Menu, contentDescription = "Menu") } },
                /*actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Default.Add, contentDescription = "add") } }*/
            )
        },
        /*bottomBar =
        {
            NavigationBar {
                NavigationBarItem(
                    selected = true,
                    onClick = { /*TODO*/ },
                    icon = { Icon(imageVector = Icons.Default.Home, contentDescription = "Home") },
                    label = { Text(text = "Home") }
                )

                NavigationBarItem(
                    selected = true,
                    onClick = { /*TODO*/ },
                    icon = { Icon(imageVector = Icons.Default.Person, contentDescription = "Person") },
                    label = { Text(text = "Profile") }
                )

                NavigationBarItem(
                    selected = true,
                    onClick = { /*TODO*/ },
                    icon = { Icon(imageVector = Icons.Default.Favorite, contentDescription = "Favorite") },
                    label = { Text(text = "Favorite") }
                )

            }
        },*/
        floatingActionButton =
        {
            FloatingActionButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "Add")
            }
        }
    )
    { paddingValues ->
        Surface(modifier = Modifier.padding(paddingValues)){
            MainContent(navController = navController)
        }
    }
}

@Composable
fun MainContent(
    navController: NavController,
    moviesList: List<Movie> = getMovies())
{


    Column (modifier = Modifier.padding(12.dp)) {
        LazyColumn {
            items(items = moviesList){
                MovieRow(movie = it) { movie ->
                    navController.navigate(route = MovieScreens.DetailsScreen.name+"/$movie")
                }
            }
        }
    }
}

