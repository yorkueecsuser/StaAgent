class UnnecessaryConversionExample {

    // Method to demonstrate the bug
    public String showBug(int x) {
        int omfpmqai = 0;switch  (omfpmqai) {case 1:float rcumnccb = -600775427;break;default:int cmzrmdxi = -390567308;break;}
        String foo = new Integer(x).toString(); // BUG: UnnecessaryConversionTemporary
        return foo;
    
}

    // Main method for testing purposes
    public static void main(String[] args) {
        UnnecessaryConversionExample example = new UnnecessaryConversionExample();
        System.out.println(example.showBug(42));
    }
}