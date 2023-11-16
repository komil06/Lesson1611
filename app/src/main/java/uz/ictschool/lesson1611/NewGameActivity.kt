package uz.ictschool.lesson1611

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun NewGameActivity(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Button(onClick = { /* Button 1 click logic */ }) {
            Text(text = "+", fontSize = 28.sp)
        }
        Spacer(modifier = Modifier.height(15.dp)) // Add spacing between buttons
        Row {
            Button(onClick = { /* Button 1 click logic */ }) {
                Text(text = "-", fontSize = 28.sp)
            }
            Spacer(modifier = Modifier.width(30.dp)) // Add spacing between buttons
            Button(onClick = { /* Button 1 click logic */ }) {
                Text(text = "*", fontSize = 28.sp)
            }
        }
        Spacer(modifier = Modifier.height(15.dp)) // Add spacing between buttons
        Button(onClick = { /* Button 1 click logic */ }, ) {
            Text(text = "/", fontSize = 28.sp)
        }
    }
    Text(
        modifier = Modifier
            .padding(20.dp)
        ,
        text = "Please Select One",
        textAlign = TextAlign.Center,

        style = TextStyle(
            fontFamily = FontFamily.Serif, // Custom font family
            fontSize = 24.sp
        )
    )
}