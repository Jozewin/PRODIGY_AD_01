package app.joze.pd_calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import app.joze.pd_calculator.ui.theme.Orange

@Composable
fun CalculatorLandScape(
    viewModel: CalculatorViewModel
) {


    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            modifier = Modifier
                .weight(1f)
        ) {
            // Your landscape layout for text input on the left side
            Text(
                text = viewModel.calculatorState.value.calculatorField,
                fontSize = 64.sp,
                style = MaterialTheme.typography.displayMedium,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                maxLines = 5,
                color = Color.White
            )
        }

        Column(
            modifier = Modifier
                .weight(1f)
                .padding(start = 16.dp)
        ) {
            Row(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                CalculatorButton(
                    symbol = "AC",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .weight(2f),
                    onClick = {
                        viewModel.onEvent(CalculatorOperations.OnAllClearEnter)
                    }
                )
                CalculatorButton(
                    symbol = "D",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorOperations.OnDeleteEnter)
                    }
                )
                CalculatorButton(
                    symbol = "%",
                    modifier = Modifier
                        .background(Orange)
                        .weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorOperations.OnSymbolEnter("/"))
                    }
                )
            }

            Row(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)

            ) {
                CalculatorButton(
                    symbol = "7",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorOperations.OnNumberEnter("7"))
                    }
                )
                CalculatorButton(
                    symbol = "8",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorOperations.OnNumberEnter("8"))
                    }
                )
                CalculatorButton(
                    symbol = "9",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorOperations.OnNumberEnter("9"))
                    }
                )
                CalculatorButton(
                    symbol = "X",
                    modifier = Modifier
                        .background(Orange)
                        .weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorOperations.OnSymbolEnter("*"))
                    }
                )
            }

            Row(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)

            ) {
                CalculatorButton(
                    symbol = "4",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorOperations.OnNumberEnter("4"))
                    }
                )
                CalculatorButton(
                    symbol = "5",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorOperations.OnNumberEnter("5"))
                    }
                )
                CalculatorButton(
                    symbol = "6",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorOperations.OnNumberEnter("6"))
                    }
                )
                CalculatorButton(
                    symbol = "-",
                    modifier = Modifier
                        .background(Orange)
                        .weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorOperations.OnSymbolEnter("-"))
                    }
                )
            }


            Row(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)

            ) {
                CalculatorButton(
                    symbol = "1",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorOperations.OnNumberEnter("1"))
                    }
                )
                CalculatorButton(
                    symbol = "2",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorOperations.OnNumberEnter("2"))
                    }
                )
                CalculatorButton(
                    symbol = "3",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorOperations.OnNumberEnter("3"))
                    }
                )
                CalculatorButton(
                    symbol = "+",
                    modifier = Modifier
                        .background(Orange)
                        .weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorOperations.OnSymbolEnter("+"))
                    }
                )
            }

            Row(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)

            ) {
                CalculatorButton(
                    symbol = "0",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .weight(2f),
                    onClick = {
                        viewModel.onEvent(CalculatorOperations.OnNumberEnter("0"))
                    }
                )
                CalculatorButton(
                    symbol = ".",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorOperations.OnDecimalEnter("."))
                    }
                )
                CalculatorButton(
                    symbol = "=",
                    modifier = Modifier
                        .background(Orange)
                        .weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorOperations.OnEqualEnter)
                    }
                )
            }
        }
    }
}


@Composable
fun CalculatorPotrait(
    viewModel: CalculatorViewModel
) {

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {


        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
        ) {

            val lineheight = MaterialTheme.typography.displayMedium.fontSize*4/3
            Text(
                text = viewModel.calculatorState.value.calculatorField,
                fontSize = 64.sp,
                style = MaterialTheme.typography.displayMedium,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth(),
                maxLines = 5,
                color = Color.White,
                lineHeight = lineheight
            )


            Row(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)

            ) {
                CalculatorButton(
                    symbol = "AC",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .weight(2f),
                    onClick = {
                        viewModel.onEvent(CalculatorOperations.OnAllClearEnter)
                    }
                )
                CalculatorButton(
                    symbol = "D",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorOperations.OnDeleteEnter)
                    }
                )
                CalculatorButton(
                    symbol = "%",
                    modifier = Modifier
                        .background(Orange)
                        .weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorOperations.OnSymbolEnter("/"))
                    }
                )
            }

            Row(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)

            ) {
                CalculatorButton(
                    symbol = "7",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorOperations.OnNumberEnter("7"))
                    }
                )
                CalculatorButton(
                    symbol = "8",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorOperations.OnNumberEnter("8"))
                    }
                )
                CalculatorButton(
                    symbol = "9",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorOperations.OnNumberEnter("9"))
                    }
                )
                CalculatorButton(
                    symbol = "X",
                    modifier = Modifier
                        .background(Orange)
                        .weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorOperations.OnSymbolEnter("*"))
                    }
                )
            }

            Row(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)

            ) {
                CalculatorButton(
                    symbol = "4",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorOperations.OnNumberEnter("4"))
                    }
                )
                CalculatorButton(
                    symbol = "5",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorOperations.OnNumberEnter("5"))
                    }
                )
                CalculatorButton(
                    symbol = "6",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorOperations.OnNumberEnter("6"))
                    }
                )
                CalculatorButton(
                    symbol = "-",
                    modifier = Modifier
                        .background(Orange)
                        .weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorOperations.OnSymbolEnter("-"))
                    }
                )
            }


            Row(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)

            ) {
                CalculatorButton(
                    symbol = "1",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorOperations.OnNumberEnter("1"))
                    }
                )
                CalculatorButton(
                    symbol = "2",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorOperations.OnNumberEnter("2"))
                    }
                )
                CalculatorButton(
                    symbol = "3",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorOperations.OnNumberEnter("3"))
                    }
                )
                CalculatorButton(
                    symbol = "+",
                    modifier = Modifier
                        .background(Orange)
                        .weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorOperations.OnSymbolEnter("+"))
                    }
                )
            }

            Row(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)

            ) {
                CalculatorButton(
                    symbol = "0",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .weight(2f),
                    onClick = {
                        viewModel.onEvent(CalculatorOperations.OnNumberEnter("0"))
                    }
                )
                CalculatorButton(
                    symbol = ".",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorOperations.OnDecimalEnter("."))
                    }
                )
                CalculatorButton(
                    symbol = "=",
                    modifier = Modifier
                        .background(Orange)
                        .weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorOperations.OnEqualEnter)
                    }
                )
            }
        }
    }
}


@Preview
@Composable
fun asdas() {
    val calViewModel = viewModel<CalculatorViewModel>()
    CalculatorPotrait(viewModel = calViewModel)
}