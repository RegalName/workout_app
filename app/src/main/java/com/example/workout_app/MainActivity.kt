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
        composable(Routes.startScreen+ "/{numberOfWorkouts}"){
            val numberOfWorkouts = it.arguments?.getInt("numberOfWorkouts")
            StartScreen(navController, numberOfWorkouts?: 0)
        }
        composable(Routes.workoutA+ "/{numberOfWorkouts}"){
            val numberOfWorkouts = it.arguments?.getInt("numberOfWorkouts")
            WorkoutA(navController, numberOfWorkouts?: 0)
        }
        composable(Routes.workoutB+ "/{numberOfWorkouts}"){
            val numberOfWorkouts = it.arguments?.getInt("numberOfWorkouts")
            WorkoutB(navController, numberOfWorkouts?: 0)
        }
        composable(Routes.workoutC+ "/{numberOfWorkouts}"){
            val numberOfWorkouts = it.arguments?.getInt("numberOfWorkouts")
            WorkoutC(navController, numberOfWorkouts?: 0)
        }
    } )
}

object Routes {
    var startScreen = "Start_Screen"
    var workoutA = "Workout_A"
    var workoutB = "Workout_B"
    var workoutC = "Workout_C"
}


