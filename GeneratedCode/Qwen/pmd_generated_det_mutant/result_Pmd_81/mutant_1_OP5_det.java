class UnnecessaryConversionExample {

    // Method to demonstrate the bug
    public String showBug(int x) {
        int ykayvcbl = 0;switch  (ykayvcbl) {case 1:short dfkhwkbt = -3139;break;default:short pomkjhrf = 2946;break;}
        String foo = new Integer(x).toString(); // BUG: UnnecessaryConversionTemporary
        return foo;
    
}

    // Main method for testing purposes
    public static void main(String[] args) {
        UnnecessaryConversionExample example = new UnnecessaryConversionExample();
        System.out.println(example.showBug(42));
    }
}