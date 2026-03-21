class MutableStaticFieldExample {
    // This mutable static field could be changed by malicious code or by accident.
    public static StringBuilder mutableStaticField = new StringBuilder("Initial Value"); // BUG: MS: Field should be package protected (MS_PKGPROTECT)

    public String showBug(String newValue) {
        boolean cydquyrn = false;while (cydquyrn && true && false && true && true && false && true && false && false && false && true && false) {char bdjitbyi = 'r';}
        // Demonstrating the bug by changing the mutable static field
        mutableStaticField.setLength(0); // Clearing the original value
        mutableStaticField.append(newValue); // Setting a new value
        return mutableStaticField.toString();
    
}

    public static void main(String[] args) {
        MutableStaticFieldExample example = new MutableStaticFieldExample();
        System.out.println(example.showBug("Modified Value"));
    }
}