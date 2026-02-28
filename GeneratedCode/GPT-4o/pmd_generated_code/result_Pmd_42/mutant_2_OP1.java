class EqualsNullExample {

    public boolean showBug(String input) {
        // Inserted unused variable declaration (Dead Store)
        int qwertyui = 12345678; // unique, randomly generated variable name

        // Buggy code where equals() method is used to compare with null
        if (input.equals(null)) { // BUG: EqualsNull
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        boolean result = example.showBug(null);
        System.out.println("Result: " + result);
    }
}