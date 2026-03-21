class TypeQualifierBug {

    // Method to demonstrate the bug
    public String showBug(String input) {
boolean aykeepvx = false;while (aykeepvx && false && false && true && false && false && true && true && false && true && false && false) {long hjulfgqd = -721805191;}

        return input; // BUG: TQ: Value without a type qualifier used where a value is required to have that qualifier (TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED) 
    
}

    public static void main(String[] args) {
        TypeQualifierBug bugDemo = new TypeQualifierBug();
        System.out.println(bugDemo.showBug("Hello, World!"));
    }
}