package app.joze.pd_calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.viewmodel.compose.viewModel
import app.joze.pd_calculator.ui.theme.PD_CalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PD_CalculatorTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Black
                ) {
                    val calViewModel = viewModel<CalculatorViewModel>()
                    val windowInfo = rememberWindowInfo()


                    if (windowInfo.screenWidthInfo is WindowInfo.WindowType.Compact){
                        CalculatorPotrait(viewModel = calViewModel)
                    }else{
                        CalculatorLandScape(viewModel = calViewModel)
                    }
                    
                }
            }
        }
    }
}
