class EqualsNullExample {

    public boolean showBug(String input) {
        // Buggy code where equals() method is used to compare with null
        if (input.equals(null)) { // BUG: EqualsNull
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        // Introduce a dead store variable as per the 'Dead Store' mutation operator
        int zxcvbnml = 42; // This is a dead store variable

        EqualsNullExample example = new EqualsNullExample();
        boolean result = example.showBug(null);
        System.out.println("Result: " + result);
    }
}