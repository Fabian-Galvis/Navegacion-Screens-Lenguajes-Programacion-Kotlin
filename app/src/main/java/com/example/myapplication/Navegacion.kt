
package com.example.myapplication

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun Navegacion(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "main") {
        composable("main") { principal(navController) }
        composable("Java") { JavaScreen(navController) }
        composable("C++") { CppScreen(navController) }
        composable("Kotlin") { KotlinScreen(navController) }
        composable("Python") { PythonScreen(navController) }
        composable("MySQL") { MySQLScreen(navController) }
    }
}
