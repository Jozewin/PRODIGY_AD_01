package app.joze.pd_calculator

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CalculatorButton(
    symbol : String,
    onClick : () -> Unit,
    modifier: Modifier = Modifier
) {

    val isLandscape = LocalConfiguration.current.orientation == Configuration.ORIENTATION_LANDSCAPE

    val fontSize = if (isLandscape) 29.sp else 42.sp
    Box(
        modifier = Modifier
            .clip(CircleShape)
            .clickable {
                onClick()
            }
        //    .padding(8.dp)
            .then(modifier)


    ){
        Text(
            text = symbol,
            fontSize = fontSize,
            modifier = Modifier
                .align(Alignment.Center)
              //  .padding(16.dp)
        )
    }
}
