public class TaxCalculationAlgorithmFactory {
    public static TaxCalculationAlgorithm getTaxCalculationAlgorithmForRegime(TaxRegime regime){
        if(regime == TaxRegime.OLD){
            return new OldRegimeTaxCalculator();
        }else if(regime == TaxRegime.NEW){
            return new NewRegimeTaxCalculator();
        }else{
            throw new IllegalArgumentException();
        }
    }
}
