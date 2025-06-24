package com.example.workout_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.workout_app.ui.theme.Workout_appTheme
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WorkoutStart()
        }
    }
}
/*
 Bei Fragen, schreiben, ich weiß nicht ob das hier veständlich ist.
 Wir sollen ja mehrere Übungen machen, dh. meine Idee wäre Folgendes:
 Wir haben am Schluss einen Startbildschirm (aka MainActivity), auf dem man verschiedene Übungen auswählt, die dann auf anderen Seiten bzw. Activities sind.
 Zuerst aber will ich eine Übung erstmal zum Laufen kriegen und das machen wir  hier in der MainActivity
 Wenn/Falls wir das schaffen, können wir uns darum kümmern, dass wir diese Übungen in die anderen Activities verlagern.
 Für die erste Übung will ich es erstmal schaffen einen Timer zu programmieren, den man starten kann und der dann bis 10 hochzählt. Glaube das ist als Grundlage ok.
*/

@Preview
@Composable
fun PreviewMessageCard() {
    WorkoutStart()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WorkoutStart() {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Text("Work!! OUT!!!!!")
                }
            )
        }
    ) {
        innerPadding ->
        Column(
            modifier = Modifier.padding(paddingValues = innerPadding),
            verticalArrangement = Arrangement.spacedBy(space = 16.dp),
        ) {
            WorkoutTimer() // Timer zählt auf Knopfdruck in Sekundentakt bis 10 und hört dann auf.
        }
    }
}

// :( <-- hier wurde ein erfolgloser Versuch gelöscht
// ok es gibt schonmal einen Timer der bis 10 zählt. als nächstes: von 10 runterzählen und startbutton. und vielleicht schöneres aussehen
@Composable
fun WorkoutTimer() {
    var timeLeft by remember { mutableIntStateOf(10) }

    LaunchedEffect(key1 = timeLeft) {
        while (timeLeft > 0) {
            delay(1000L)
            timeLeft--
        }
    }
    Text(text = "Time left: $timeLeft")
}