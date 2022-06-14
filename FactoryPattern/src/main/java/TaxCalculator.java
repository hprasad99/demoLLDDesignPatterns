public class TaxCalculator {
    int calculateTax(SalaryDetails salaryDetails,TaxRegime regime){
        TaxCalculationAlgorithm taxCalculationAlgorithm = TaxCalculationAlgorithmFactory.getTaxCalculationAlgorithmForRegime(regime);
        return taxCalculationAlgorithm.calculateTax(salaryDetails);
    }
}
