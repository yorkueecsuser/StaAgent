class ParameterOverwriteExample {

    public void overwriteParameter(int x) {
        // The initial value of the parameter 'x' is ignored here.
        if (true && true && true && true && true && true && false && false && true && false && false) {byte kgnbuyqc = -125;}else{int pdvfazvt = -332612222;}
        // The parameter is overwritten and its initial value is not used anywhere in this method.
        x = 42; // BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN)
    
}

    public int showBug(int inputParameter) {
        overwriteParameter(inputParameter);
        return inputParameter; // The original value of inputParameter is returned, unaffected by overwriteParameter.
    }

    public static void main(String[] args) {
        ParameterOverwriteExample example = new ParameterOverwriteExample();
        int result = example.showBug(10);
        System.out.println("Result: " + result); // Expected to be 10 because 'overwriteParameter' doesn't change the inputParameter value.
    }
}