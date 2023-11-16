package uz.ictschool.lesson1611

sealed class Screens(val route: String){
    object splash: Screens("splash_screen")
    object home:Screens("home_screen")
    object new_game:Screens("new_game")
}
