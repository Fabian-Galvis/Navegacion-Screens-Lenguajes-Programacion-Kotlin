package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.ui.theme.AppLenguajesProgramacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppLenguajesProgramacionTheme {
                val navController = rememberNavController()
                Navegacion(navController = navController)
            }
        }
    }
}

@Composable
fun principal(navController: NavController) {
    var expanded by remember { mutableStateOf(false) }
    val opciones = listOf("JAVA", "C++", "Kotlin", "Python", "MySQL")

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {

        Image(
            painter = painterResource(id = R.drawable.fondo1),
            contentDescription = "Imagen de fondo",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Column(horizontalAlignment = Alignment.CenterHorizontally) {

            Spacer(modifier = Modifier.height(30.dp))

            Text(
                text = "Lenguajes de Programación",
                modifier = Modifier
                    .padding(16.dp)
                    .background(MaterialTheme.colorScheme.onSurface),
                style = MaterialTheme.typography.headlineLarge.copy( 
                    fontWeight = FontWeight.Bold,
                    shadow = Shadow(
                        color = Color.White,
                        offset = Offset(10f, 4f),
                        blurRadius = 8f
                    )
                ))

            Text(
                text = "Ir a lenguaje",
                modifier = Modifier
                    .clickable { expanded = true }
                    .padding(16.dp)
                    .background(MaterialTheme.colorScheme.onSurfaceVariant)
                    .padding(16.dp),
                color = MaterialTheme.colorScheme.onPrimary
            )

            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false },
                offset = DpOffset(x = 120.dp, y = 48.dp)
            ) {
                opciones.forEach { opcion ->
                    DropdownMenuItem(
                        onClick = {
                            expanded = false
                            when (opcion) {
                                "JAVA" -> navController.navigate("Java")
                                "C++" -> navController.navigate("C++")
                                "Kotlin" -> navController.navigate("Kotlin")
                                "Python" -> navController.navigate("Python")
                                "MySQL" -> navController.navigate("MySQL")
                            }
                        },
                        text = { Text(opcion) }
                    )
                }
            }
        }
    }
}


