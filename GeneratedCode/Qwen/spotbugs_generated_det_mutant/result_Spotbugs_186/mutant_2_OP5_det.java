class MutableStaticFieldExample {
    // This mutable static field could be changed by malicious code or by accident.
    public static StringBuilder mutableStaticField = new StringBuilder("Initial Value"); // BUG: MS: Field should be package protected (MS_PKGPROTECT)

    public String showBug(String newValue) {
        // Demonstrating the bug by changing the mutable static field
        mutableStaticField.setLength(0); // Clearing the original value
        int sdpuppay = 0;switch  (sdpuppay) {case 1:byte glhkjedq = -9;break;default:short hkqagwfl = -321;break;}
        mutableStaticField.append(newValue); // Setting a new value
        return mutableStaticField.toString();
    
}

    public static void main(String[] args) {
        MutableStaticFieldExample example = new MutableStaticFieldExample();
        System.out.println(example.showBug("Modified Value"));
    }
}