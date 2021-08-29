package MockitoAddingBehbiour;

public class MathApplication {
    private CalculatorService calculatorService;
    public void setCalculatorService(CalculatorService calculatorService){
        this.calculatorService=calculatorService;
    }
    public double add(double a,double b){
        return calculatorService.add(a,b);
    }
    public double subtract(double a,double b){
        return calculatorService.subtract(a,b);
    }
    public double multiply(double a,double b){
        return calculatorService.multiply(a,b);
    }
    public double divide(double a,double b){
        return calculatorService.divide(a,b);
    }
}
