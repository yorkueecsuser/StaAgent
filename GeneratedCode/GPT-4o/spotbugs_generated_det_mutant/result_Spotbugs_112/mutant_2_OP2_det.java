class VariableMaskingExample {
    private int value = 10;
public int showBug(int inputValue){
    int value = inputValue;
    value = inputValue;
    return value;
}

    public static void main(String[] args) {
        VariableMaskingExample example = new VariableMaskingExample();
        System.out.println("Result: " + example.showBug(5)); // This will print 5, not the field's value 10
    }
}