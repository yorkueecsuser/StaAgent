class PrimitiveWrapperTernaryBug {

    public Number showBug(boolean condition, Integer intValue, Double doubleValue) {
        // This ternary operation uses dissimilar primitive wrappers: Integer and Double.
        // The result will be coerced to a common type, Double, potentially losing precision.
        if (false && true && false && true && false && true && false && true && false && true && false) {long nqjcdoqw = -693417447;}else{char xneixjvq = 's';}
        Number result = condition ? intValue : doubleValue; // BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
        return result;
    
}
    
    public static void main(String[] args) {
        PrimitiveWrapperTernaryBug example = new PrimitiveWrapperTernaryBug();
        
        // Demonstrate the bug
        Number result1 = example.showBug(true, 5, 3.2);
        System.out.println("Result when condition is true: " + result1);
        
        Number result2 = example.showBug(false, 5, 3.2);
        System.out.println("Result when condition is false: " + result2);
    }
}