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

/*
 Von hier aus kann man zu den verschiedenen Workouts navigieren.
 In den verschiedenen Workout-Activities gibt es einen "Finisch Workout" Button der wieder
 hierhin zurückführt und irgendwann auch den Zähler der abgeschlossenen Workouts erhöht. Idealerweise
 kann man auch erst auf "Finish Workout" drücken wenn der Zähler abgelaufen ist aber. Tja.
 Da ich mit dem Zähler viel Zeit verschwendet habe gibt es auch noch kaum Workouts. In res/drawable
 sind ein paar (2) Bilder aus der Wiiki.
*/

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StartScreen(navController : NavController) {
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
                navController.navigate(Routes.workoutA)
            }) {
                Text("Single Leg Extension")
            }
            Button(onClick = {
                navController.navigate(Routes.workoutB)
            }) {
                Text("Plank")
            }
            Button(onClick = {
                navController.navigate(Routes.workoutC)
            }) {
                Text("Workout C") // hier könnte noch etwas aus https://wiisports.fandom.com/wiki/Category:Strength_Training hinkommen
            }
            Text("Du hast ?/3 Workouts abgeschlossen. (Wenns alle sind: Glückwunsch!") // daraus wird erstmal nichts
            Text("Workout instructions stolen from the WiiSports Wiki")
        }
    }
}