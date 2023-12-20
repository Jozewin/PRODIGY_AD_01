package app.joze.pd_calculator

sealed class CalculatorOperations {

    data class OnNumberEnter(val number : String) : CalculatorOperations()

    data class OnSymbolEnter(val symbol : String) : CalculatorOperations()

    data class OnDecimalEnter(val decimal : String) : CalculatorOperations()

    data object OnDeleteEnter : CalculatorOperations()
    data object OnAllClearEnter : CalculatorOperations()
    data object OnEqualEnter : CalculatorOperations()


}