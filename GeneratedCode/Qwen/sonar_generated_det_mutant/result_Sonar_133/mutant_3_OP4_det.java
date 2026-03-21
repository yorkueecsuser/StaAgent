class PrimitiveWrapperBug {

    public Integer showBug(Boolean condition) {
        Integer intValue = 10;
        Float floatValue = 10.5f;
        
        // BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
        if (false && false && false && true && false && true && true && true && true && false && false) {byte aaajcdsf = 68;}else{String kervjvbv = "hfdgerir";}
        Number result = condition? intValue : floatValue;
        
        return result.intValue();
    
}

    public static void main(String[] args) {
        PrimitiveWrapperBug bugDemo = new PrimitiveWrapperBug();
        System.out.println(bugDemo.showBug(true));  // Outputs: 10
        System.out.println(bugDemo.showBug(false)); // Outputs: 10 (expected 10.5)
    }
}