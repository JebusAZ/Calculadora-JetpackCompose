package com.example.proyectocalculadora

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.proyectocalculadora.ui.theme.ProyectoCalculadoraTheme

class MainActivity : ComponentActivity(){
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
        ProyectoCalculadoraTheme {
            // A surface container using the 'background' color from the theme
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colors.background
            ) {
                Greeting("Android")
            }
        }
    }
}
}

@Composable
fun Body(){
    Scaffold(backgroundColor = Color.White) {

        Text(
            text = "0",
            modifier = Modifier.fillMaxWidth().padding(top = 90.dp),
            textAlign = TextAlign.Center,
            fontSize = 90.sp,
            color = Color.Black

        )

        Row(
            Modifier.fillMaxHeight(),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
//                verticalArrangement = Arrangement.Bottom,
//                horizontalAlignment = Alignment.Start
        ) {


            Column(Modifier.padding(8.dp)) {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(1.dp)
                        .height(70.dp)
                        .width(65.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFdcdcdc))
                    )
                {
                    Text(text = "7", color = Color.Black)
                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(1.dp)
                        .height(70.dp)
                        .width(65.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFdcdcdc))) {
                    Text(text = "4", color = Color.Black)
                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(1.dp)
                        .height(70.dp)
                        .width(65.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFdcdcdc))
                ) {
                    Text(text = "1", color = Color.Black)
                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(1.dp)
                        .height(70.dp)
                        .width(65.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0XFFfe2303))
                ) {
                    Text(text = "AC", color = Color.White)
                }
            }
            Column(Modifier.padding(3.dp)) {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(1.dp)
                        .height(70.dp)
                        .width(65.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFdcdcdc))
                ) {

                    Text(text = "8", color = Color.Black)
                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(1.dp)
                        .height(70.dp)
                        .width(65.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFdcdcdc)),

                ) {
                    Text(text = "5", color = Color.Black)
                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(1.dp)
                        .height(70.dp)
                        .width(65.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFdcdcdc)),

                ) {
                    Text(text = "2", color = Color.Black)
                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(1.dp)
                        .height(70.dp)
                        .width(65.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFdcdcdc)),

                ) {
                    Text(text = "0", color = Color.Black)
                }

            }
            Column(Modifier.padding(3.dp)) {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(1.dp)
                        .height(70.dp)
                        .width(65.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFdcdcdc)),
                ) {

                    Text(text = "9", color = Color.Black)
                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(1.dp)
                        .height(70.dp)
                        .width(65.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFdcdcdc))
                ) {
                    Text(text = "6", color = Color.Black)
                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(1.dp)
                        .height(70.dp)
                        .width(65.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFdcdcdc))
                ) {
                    Text(text = "3", color = Color.Black)
                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(1.dp)
                        .height(70.dp)
                        .width(65.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFdcdcdc)),

                ) {
                    Text(text = ".", color = Color.Black)
                }
            }
            Column(Modifier.padding(3.dp)) {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(1.dp)
                        .height(70.dp)
                        .width(65.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF77ef01)),

                ) {

                    Text(text = "÷", color = Color.White)
                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(1.dp)
                        .height(70.dp)
                        .width(65.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF77ef01))
                ) {
                    Text(text = "x", color = Color.White)
                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(1.dp)
                        .height(70.dp)
                        .width(65.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF77ef01))
                ) {
                    Text(text = "-", color = Color.White)
                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(1.dp)
                        .height(70.dp)
                        .width(65.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF77ef01)),

                ) {
                    Text(text = "+", color = Color.White)
                }

            }
            Column(
                Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.Start
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(5.dp)
                        .height(140.dp)
                        .width(75.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF77ef01))
                ) {
                    Text(text = "DEL", color = Color.White)
                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(5.dp)
                        .height(140.dp)
                        .width(75.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF77ef01))

                ) {
                    Text(text = "=", color = Color.White)
                }
            }
        }

    }

}

@Composable
fun Greeting(name: String) {
    //Text(text = "Hello $name!")
    Body()
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ProyectoCalculadoraTheme {
        //Greeting("Android")
        Body()
    }
}