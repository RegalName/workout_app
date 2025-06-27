# Erstelle eine Workout-App, die folgende Funktionen umfasst:

* Verschiedene Übungen mit Text- und Bildbeschreibung
* Pausen zwischen den Übungen
* Soundeffekte zur Signalisierung von Start und Ende der Übungen und Pausen
* Fortschrittsanzeige mit abgeschlossenen und ausstehenden Workouts
 

## Vorbereitung

Erstelle ein neues Android-Projekt in Android Studio und wähle Kotlin als Programmiersprache.
Nutze ViewModel & LiveData, um den Timer und den Ablauf der Übungen zu verwalten.
Verwende SharedPreferences oder eine lokale Datenbank, um den Fortschritt zu speichern.
 

## Funktionale Anforderungen

* Übungen anzeigen: Jede Übung enthält eine Textbeschreibung und ein Bild und die Reihenfolge der Übungen kann festgelegt oder zufällig sein.
* Pausen zwischen den Übungen: Die verbleibende Zeit wird als Countdown angezeigt.
* Soundeffekte zur Orientierung: Ein Signalton kündigt den Start und das Ende jeder Übung an und ein anderer Sound signalisiert den Beginn und das Ende der Pausen.
* Fortschrittsanzeige: Erfüllte Workouts werden gespeichert und User sehen z.B. mit einem Forschrittsbalken, wie viele Übungen sie bereits abgeschlossen haben.
 

## Beispiel-Workflow:

* User startet ein Workout.
* Erste Übung wird mit Text und Bild angezeigt.
* Nach Ablauf der Übungszeit ertönt ein Signalton → Pause beginnt.
* Während der Pause läuft ein Countdown, danach folgt die nächste Übung.
* Am Ende der Übung wird der Fortschritt aktualisiert und angezeigt.

## Extra-Herausforderungen (optional)

Falls du die Grundfunktionen schnell umgesetzt hast, kannst du noch folgende Features einbauen:

* Eine Statistik zeigt z. B. durchschnittliche Trainingsdauer oder häufigste Übung.
* Anpassbare Sounds und Countdown-Zeiten
* Erweiterung um Video- oder GIF-Animationen für Übungen
* Belohnungssystem (z. B. Badges für abgeschlossene Workouts)
