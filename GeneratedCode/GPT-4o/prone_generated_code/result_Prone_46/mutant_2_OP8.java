class EqualsNullExample {

    public boolean showBug(String input) {
        // Check if the input equals null
        if (input.equals(null)) { // BUG: EqualsNull
            return true;
        } else {
            return false;
        }
    }

    // Mutant 1
    public boolean showBugMutant1(String x) {
        // Check if the input equals null
        if (x.equals(null)) { // BUG: EqualsNull
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        System.out.println("Result when input is null: " + example.showBug(null));
        System.out.println("Result when input is not null: " + example.showBug("NotNull"));

        // Test mutant
        System.out.println("Mutant Result when input is null: " + example.showBugMutant1(null));
        System.out.println("Mutant Result when input is not null: " + example.showBugMutant1("NotNull"));
    }
}