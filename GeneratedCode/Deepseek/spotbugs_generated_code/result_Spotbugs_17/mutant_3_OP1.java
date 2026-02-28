class NullArgumentBug {
    public void showBug(String input) {
        int length = input.length();
        // Mutation: Dead Store
        int unusedVar = 5; // adding a dead store variable
        System.out.println("Length of the input: " + length);
    }
}