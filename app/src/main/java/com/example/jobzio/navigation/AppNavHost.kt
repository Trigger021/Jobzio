package com.example.jobzio.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jobzio.MoreScreen
import com.example.jobzio.ui.theme.screens.About.AboutScreen
import com.example.jobzio.ui.theme.screens.contact.ContactScreen
import com.example.jobzio.ui.theme.screens.home.HomeScreen
import com.example.jobzio.ui.theme.screens.login.LoginScreen
import com.example.jobzio.ui.theme.screens.products.AddServicesScreen
import com.example.jobzio.ui.theme.screens.products.ViewServicesScreen
import com.example.jobzio.ui.theme.screens.signup.SignupScreen
import com.example.jobzio.ui.theme.screens.splash.SplashScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController:NavHostController = rememberNavController(),
    startDestination:String = SPLASH_URL
){
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier){
        composable(LOGIN_URL){
            LoginScreen(navController = navController)
        }
        composable(SIGNUP_URL){
            SignupScreen(navController = navController)
        }
        composable(HOME_URL){
            HomeScreen(navController = navController)
        }
        composable(ADD_SERVICES_URL){
            AddServicesScreen(navController = navController)
        }
        composable(VIEW_SERVICES_URL){
           ViewServicesScreen(navController = navController)
        }

        composable(SPLASH_URL){
            SplashScreen(navController = navController)
        }

        composable(MORE_URL){
           MoreScreen(navController = navController)
        }

        composable(ABOUT_URL){
            AboutScreen(navController = navController)
        }

        composable(CONTACT_URL){
            ContactScreen(navController = navController)
        }
    }
}