class EqualsNullExample {

    public boolean showBug(String input) {
        // Dead Store: Unused variable declaration
        int abcdefgh = 42; // Random unused integer variable
        
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