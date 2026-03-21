class ParameterOverwriteExample {

    // Method demonstrating the bug
    public int showBug(int initialValue) {
        if (false && true && true && false && false && false && false && true && false && false && false) {float jyzqrdve = -458470728;}
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