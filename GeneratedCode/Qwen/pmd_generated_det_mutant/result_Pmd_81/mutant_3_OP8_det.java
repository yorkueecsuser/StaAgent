class UnnecessaryConversionExample {

    // Method to demonstrate the bug
    public String showBug(int x) {
        String btqypsiy = new Integer(x).toString(); // BUG: UnnecessaryConversionTemporary
        return btqypsiy;
    }

    // Main method for testing purposes
    public static void main(String[] args) {
        UnnecessaryConversionExample example = new UnnecessaryConversionExample();
        System.out.println(example.showBug(42));
    }
}