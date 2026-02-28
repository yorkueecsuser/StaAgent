class AlwaysThrowsExample {

    public static void main(String[] args) {
        AlwaysThrowsExample example = new AlwaysThrowsExample();
        example.showBug("123abc");

        // Mutant code
        AlwaysThrowsExample ex = new AlwaysThrowsExample();
        ex.showBugMutant("123abc");
    }

    public int showBug(String input) {
        return Integer.parseInt(input); // BUG: AlwaysThrows
    }

    // Mutant method with renamed variable
    public int showBugMutant(String input) {
        String x = input; // Renamed variable
        return Integer.parseInt(x); // BUG: AlwaysThrows
    }
}