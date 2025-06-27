package com.example.workout_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppNavigation()
        }
    }
}

// Hier werden die Activities verwaltet. Leitet sofort auf StartScreen um
@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.startScreen, builder ={
        composable(Routes.startScreen){
            StartScreen(navController)
        }
        composable(Routes.workoutA){
            WorkoutA(navController)
        }
        composable(Routes.workoutB){
            WorkoutB(navController)
        }
        composable(Routes.workoutC){
            WorkoutC(navController)
        }
    } )
}

object Routes {
    var startScreen = "Start_Screen"
    var workoutA = "Workout_A"
    var workoutB = "Workout_B"
    var workoutC = "Workout_C"
}


