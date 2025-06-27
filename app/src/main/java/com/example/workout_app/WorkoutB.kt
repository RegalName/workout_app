package com.example.workout_app

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

// https://wiisports.fandom.com/wiki/Plank

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WorkoutB(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Text("Plank")
                }
            )
        }
    ) {
            innerPadding ->

        Column(
            Modifier
                .fillMaxSize()
                .padding(innerPadding),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text("Start by laying on your chest.\n" +
                    "\n" +
                    "Put your hands together or apart.\n" +
                    "\n" +
                    "Go onto your toes and push your body off of the ground.\n" +
                    "\n" +
                    "Keep this pose for thirty, sixty, or ninety seconds. ")
            Button(onClick = {
                navController.navigate(Routes.startScreen)
            }) {
                Text("Finish Workout")
            }
        }
    }
}