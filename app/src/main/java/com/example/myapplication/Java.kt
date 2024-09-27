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
fun JavaScreen(navController: NavController) {
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
                text = "JAVA",
                style = MaterialTheme.typography.titleLarge,
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.padding(16.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.java_logo),
                contentDescription = "Logo de Java",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
            )

            Text(
                text = "Java es un lenguaje de programación de propósito general, orientado a objetos y ampliamente utilizado. Es conocido por su portabilidad, ya que el código Java puede ejecutarse en cualquier máquina que tenga instalada una máquina virtual Java (JVM).",
                modifier = Modifier.padding(16.dp)
            )
            Text(
                text = "public class Main {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        System.out.println(\"Hola, Mundo\");\n" +
                        "    }\n" +
                        "}",
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
                Button(onClick = { navController.navigate("C++") }) {
                    Text("Siguiente")
                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun JavaScreenPreview() {
    AppLenguajesProgramacionTheme {
        JavaScreen(navController = rememberNavController())
    }
}
