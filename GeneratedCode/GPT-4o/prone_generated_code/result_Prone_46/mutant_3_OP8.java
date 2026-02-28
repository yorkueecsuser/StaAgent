class EqualsNullExample {

    public boolean showBug(String input) {
        // Check if the input equals null
        if (input.equals(null)) { // BUG: EqualsNull
            return true;
        } else {
            return false;
        }
    }

    public boolean showBugMutant(String a) {
        // Check if the input equals null
        if (a.equals(null)) { // BUG: EqualsNull
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        System.out.println("Result when input is null: " + example.showBug(null));
        System.out.println("Result when input is not null: " + example.showBug("NotNull"));

        // Testing the mutant method
        System.out.println("Result when input is null (Mutant): " + example.showBugMutant(null));
        System.out.println("Result when input is not null (Mutant): " + example.showBugMutant("NotNull"));
    }
}