package com.example.workout_app

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.delay

//@Preview
//@Composable
//fun PreviewMessageCard() {
//    StartScreen(navController = rememberNavController(), numberOfWorkouts = Int)
//}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StartScreen(navController : NavController, numberOfWorkouts : Int) {
//    var numberOfWorkouts = numberOfWorkouts
    Scaffold(
        topBar = {
            TopAppBar(
                colors = topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Text("WORKOUT APP")
                }
            )
        }
    ) {
            innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,

        ) {
            Button(onClick = {
                navController.navigate(Routes.workoutA+ "/$numberOfWorkouts")
            }) {
                Text("Single Leg Extension")
            }
            Button(onClick = {
                navController.navigate(Routes.workoutB+ "/$numberOfWorkouts")
            }) {
                Text("Plank")
            }
            Button(onClick = {
                navController.navigate(Routes.workoutC+ "/$numberOfWorkouts")
            }) {
                Text("Workout C")
            }
            Text("Du hast $numberOfWorkouts/3 Workouts abgeschlossen. (Wenns alle sind: Glückwunsch!")
            Text("Workout instructions stolen from the WiiSports Wiki")
        }
    }
}