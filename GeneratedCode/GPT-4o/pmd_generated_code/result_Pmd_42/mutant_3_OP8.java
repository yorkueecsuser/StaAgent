class EqualsNullExample {

    public boolean showBug(String input) {
        // Buggy code where equals() method is used to compare with null
        if (input.equals(null)) { // BUG: EqualsNull
            return true;
        }
        return false;
    }

    // Mutant addition
    public boolean showBugMutant(String a) {
        // Buggy code where equals() method is used to compare with null
        if (a.equals(null)) { // BUG: EqualsNull
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        boolean result = example.showBug(null);
        System.out.println("Result: " + result);

        // Mutant test
        boolean mutantResult = example.showBugMutant(null);
        System.out.println("Mutant Result: " + mutantResult);
    }
}