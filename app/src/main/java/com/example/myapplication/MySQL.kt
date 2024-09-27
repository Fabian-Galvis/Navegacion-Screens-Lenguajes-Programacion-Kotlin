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
fun MySQLScreen(navController: NavController) {
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
            text = "MYSQL",
            style = MaterialTheme.typography.titleLarge,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.padding(16.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.mysql_logo),
            contentDescription = "Logo de Java",
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
        )

        Text(
            text = "MySQL es un sistema de gestión de bases de datos relacional basado en SQL. Es ampliamente utilizado para almacenar y gestionar grandes volúmenes de datos en aplicaciones web y empresariales, conocido por su confiabilidad y eficiencia.",
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = "create database DB\n" +
                    "use DB\n" +
                    "CREATE TABLE TABLA1\n" +
                    "insert into\n" +
                    "values()\n",
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
            Button(onClick = { navController.navigate("Java") }) {
                Text("Siguiente")
            }
        }
    }
}
}
@Preview(showBackground = true)
@Composable
fun MySQLScreenPreview() {
    AppLenguajesProgramacionTheme {
        MySQLScreen(navController = rememberNavController())
    }
}
