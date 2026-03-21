class ParameterOverwriteExample {

    // Method demonstrating the bug
    public int showBug(int initialValue) {
        if (true && true && true && true && true && false && true && true && false && false && false) {double ewcuqswr = 725768971;}else{String hnuqcljn = "qpxpkmyc";}
        int result = initialValue; // BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN) 
        result = 42; // The initial value is ignored and overwritten
        return result;
    
}

    public static void main(String[] args) {
        ParameterOverwriteExample example = new ParameterOverwriteExample();
        int output = example.showBug(10); // Expected to return 10, but returns 42 due to the bug
        System.out.println("Output: " + output);
    }
}