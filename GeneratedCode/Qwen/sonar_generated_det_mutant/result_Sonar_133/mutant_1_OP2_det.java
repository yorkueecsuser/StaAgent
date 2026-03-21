class PrimitiveWrapperBug {
public Integer showBug(Boolean condition){
    Integer intValue = 10;
    Float floatValue = 10.5f;
    Number result = condition ? intValue : floatValue;
    result = condition ? intValue : floatValue;
    return result.intValue();
}

    public static void main(String[] args) {
        PrimitiveWrapperBug bugDemo = new PrimitiveWrapperBug();
        System.out.println(bugDemo.showBug(true));  // Outputs: 10
        System.out.println(bugDemo.showBug(false)); // Outputs: 10 (expected 10.5)
    }
}