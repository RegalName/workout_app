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
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WorkoutA() {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Text("Single Leg Extension")
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
            Text("Workout A")
            //konnte es nicht umsetzen, was ich mit exercises versuchte: mehr s. unten in fun
            Exercises()
            WorkoutTimer() // Timer zählt auf Knopfdruck in Sekundentakt bis 10 und hört dann auf.
        }
    }
}

@Composable
fun Exercises(){
    var selection by remember { mutableStateOf(null) }
    Button(onClick = {
//        selection = "single_leg_extension"
    }) {
        Text("Single Leg Extension") //pngs im res ordner
    }
}

/* (youtuber voice) Nina hier,whatsup. Ich finde SO viele Alternativen zum Timer wtf.
* erste optische Orientierung, um weiter deinen Timer zu implementieren: https://stackoverflow.com/questions/71191340/how-can-i-implement-a-timer-in-a-portable-way-in-jetpack-compose
* Ich kriege es aber nicht gebacken zu centern argh
*/

@Composable
fun WorkoutTimer() {
    var timeLeft by remember { mutableIntStateOf(10) }
    var isRunning by remember {mutableStateOf(false)}

// geändert, wegen Abhängigkeit vom Start Button
    LaunchedEffect(isRunning) {
        if (isRunning) {
            while (timeLeft > 0) {
                delay(1000L)
                timeLeft--
            }
            isRunning = false
        }
    }

// Anzeige von Button und .. der Sekundenanzeige
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {

        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    top = 15.dp,
                    bottom = 10.dp,
                ),
            text = "Time left: $timeLeft"
        )

        Button(onClick = {
            if(!isRunning && timeLeft > 0){
                isRunning = true
            }
        },
            enabled =!isRunning && timeLeft>0){
            Text("Let's GO!")
        }

    }
}