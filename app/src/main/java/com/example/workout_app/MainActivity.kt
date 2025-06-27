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


@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.startScreen, builder ={
        composable(Routes.startScreen){
            StartScreen(navController)
        }
        composable(Routes.WorkoutA){
            WorkoutA()
        }
        composable(Routes.WorkoutB){
            WorkoutB()
        }
        composable(Routes.WorkoutC){
            WorkoutC()
        }
    } )
}

object Routes {
    var startScreen = "Start_Screen"
    var WorkoutA = "Workout_A"
    var WorkoutB = "Workout_B"
    var WorkoutC = "Workout_C"
}


