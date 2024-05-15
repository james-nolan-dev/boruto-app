package me.nolanjames.borutoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import me.nolanjames.borutoapp.navigation.SetupNavGraph
import me.nolanjames.borutoapp.ui.theme.BorutoAppTheme

class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BorutoAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    navController = rememberNavController()
                    SetupNavGraph(navController = navController)
                }
            }
        }
    }
}
