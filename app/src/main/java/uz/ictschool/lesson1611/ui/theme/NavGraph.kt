package uz.ictschool.lesson1611.ui.theme

import android.window.SplashScreen
import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import uz.ictschool.lesson1611.HomeActivity
import uz.ictschool.lesson1611.NewGameActivity
import uz.ictschool.lesson1611.Screens
import uz.ictschool.lesson1611.SplashActivity

@Composable
fun NavGraph (navController: NavHostController){
    NavHost(navController = navController, startDestination = Screens.splash.route){
        composable(route = Screens.splash.route){
            SplashActivity(navController)
        }
        composable(route = Screens.home.route){
            HomeActivity(navController)
        }
        composable(route = Screens.new_game.route){
            NewGameActivity(navController)
        }
    }
}