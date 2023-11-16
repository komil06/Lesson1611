package uz.ictschool.lesson1611

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun HomeActivity(navController: NavController){
     Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally){
           Image(painter = painterResource(id = R.drawable.l),
               contentDescription = "Crazy Math" )
           Button(onClick = {

               navController.navigate(Screens.new_game.route)
           }){
               Text(text = "New Game", fontSize = 24.sp)
           }
     }
}