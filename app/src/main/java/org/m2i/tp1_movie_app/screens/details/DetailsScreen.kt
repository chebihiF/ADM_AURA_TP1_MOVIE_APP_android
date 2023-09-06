package org.m2i.tp1_movie_app.screens.details

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun DetailsScreen(navController: NavController, movie: String?){
    Text(text = movie.toString())
}