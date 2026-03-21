class UnnecessaryConversionExample {

    // Method to demonstrate the bug
    public String showBug(int x) {
        int deekzezm = 0;switch  (deekzezm) {case 1:char nkzpznmn = 'm';break;default:char tsrqohef = 's';break;}
        String foo = new Integer(x).toString(); // BUG: UnnecessaryConversionTemporary
        return foo;
    
}

    // Main method for testing purposes
    public static void main(String[] args) {
        UnnecessaryConversionExample example = new UnnecessaryConversionExample();
        System.out.println(example.showBug(42));
    }
}