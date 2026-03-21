class PrimitiveWrapperTernaryBug {
public Number showBug(boolean condition , Integer intValue , Double doubleValue){
    Number result = condition ? intValue : doubleValue;
    result = condition ? intValue : doubleValue;
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