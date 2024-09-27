package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.ui.theme.AppLenguajesProgramacionTheme

@Composable
fun KotlinScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        Image(
            painter = painterResource(id = R.drawable.fondo2),
            contentDescription = "Imagen de fondo",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "KOTLIN",
            style = MaterialTheme.typography.titleLarge,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.padding(16.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.kotlin_logo),
            contentDescription = "Logo de Java",
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
        )

        Text(
            text = "Kotlin es un lenguaje de programación moderno y conciso, desarrollado por JetBrains, que se ejecuta en la JVM. Se ha convertido en el lenguaje preferido para el desarrollo de aplicaciones Android debido a su interoperabilidad con Java y su sintaxis más expresiva.",
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = "def factorial(n):\n" +
                    "    if n == 0:\n" +
                    "        return 1\n" +
                    "    else:\n",
            modifier = Modifier.padding(16.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(onClick = { navController.navigate("main") }) {
                Text("Inicio")
            }
            Button(onClick = { navController.navigate("Python") }) {
                Text("Siguiente")
            }
        }
    }
}
}
@Preview(showBackground = true)
@Composable
fun KotlinScreenPreview() {
    AppLenguajesProgramacionTheme {
        KotlinScreen(navController = rememberNavController())
    }
}
