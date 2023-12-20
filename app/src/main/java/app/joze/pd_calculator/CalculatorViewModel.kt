package app.joze.pd_calculator

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import net.objecthunter.exp4j.ExpressionBuilder

class CalculatorViewModel : ViewModel() {

    private val _calculatorState = mutableStateOf(CalculatorState())
    val calculatorState = _calculatorState

    fun onEvent(event: CalculatorOperations) {
        val operations = arrayOf('+', '-', '*', '.', '/')
        when (event) {

            CalculatorOperations.OnAllClearEnter -> {
                if (calculatorState.value.calculatorField.isEmpty()) return
                _calculatorState.value = calculatorState.value.copy(
                    calculatorField = ""
                )
            }

            is CalculatorOperations.OnDecimalEnter -> {
                if (calculatorState.value.calculatorField.lastOrNull() in operations || calculatorState.value.calculatorField.isEmpty()) return
                _calculatorState.value = calculatorState.value.copy(
                    calculatorField = calculatorState.value.calculatorField+event.decimal
                )
            }

            CalculatorOperations.OnDeleteEnter -> {
                if (calculatorState.value.calculatorField.isEmpty()) return
                _calculatorState.value = calculatorState.value.copy(
                    calculatorField = calculatorState.value.calculatorField.dropLast(1)
                )
            }

            CalculatorOperations.OnEqualEnter -> {
                val result = isEqualClick(calculatorState.value.calculatorField)

                _calculatorState.value = calculatorState.value.copy(
                    calculatorField = result
                )
            }

            is CalculatorOperations.OnNumberEnter -> {
                _calculatorState.value = calculatorState.value.copy(
                    calculatorField = _calculatorState.value.calculatorField + event.number
                )
                Log.d("Main", "The state is ${_calculatorState.value.calculatorField} 00")
            }

            is CalculatorOperations.OnSymbolEnter -> {
                if (calculatorState.value.calculatorField.lastOrNull() in operations || calculatorState.value.calculatorField.isEmpty()) return
                _calculatorState.value = calculatorState.value.copy(
                    calculatorField = calculatorState.value.calculatorField+event.symbol
                )
            }

        }
    }

    private fun isEqualClick(text: String): String {
        if (text.isEmpty() || text.lastOrNull()in arrayOf(
                '+',
                '-',
                '*',
                '.',
                '/'
            ) )     return text

        val eval = ExpressionBuilder(text).build()
        val res = eval.evaluate()
        if (res.toString().endsWith("0"))   return res.toInt().toString()
        return res.toString()
    }
}
