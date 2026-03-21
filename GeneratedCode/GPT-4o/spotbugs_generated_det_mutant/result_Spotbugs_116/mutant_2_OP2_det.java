class IntegralValueCastingBug {
public double showBug(int intValue){
    double result = Math.ceil(( double)intValue);
    result = Math.ceil(( double)intValue);
    return result;
}

    public static void main(String[] args) {
        IntegralValueCastingBug bugDemo = new IntegralValueCastingBug();
        int testValue = 42;
        double result = bugDemo.showBug(testValue);
        System.out.println("Result of Math.ceil on integral value: " + result);
    }
}