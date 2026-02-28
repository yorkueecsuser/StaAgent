class EqualsNullExample {

    public boolean showBug(String input) {
        // Adding a dead store as described by the mutation operator
        int abcdwxyz = 42; // Unused variable of primitive type int

        // Check if the input equals null
        if (input.equals(null)) { // BUG: EqualsNull
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        System.out.println("Result when input is null: " + example.showBug(null));
        System.out.println("Result when input is not null: " + example.showBug("NotNull"));
    }
}