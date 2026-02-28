class AlwaysThrowsExample {

    public static void main(String[] args) {
        AlwaysThrowsExample example = new AlwaysThrowsExample();
        example.showBug("123abc");
        // Mutant code
        AlwaysThrowsExample exampleMutant = new AlwaysThrowsExample();
        exampleMutant.showBug("123abc");
    }

    public int showBug(String input) {
        return Integer.parseInt(input); // BUG: AlwaysThrows
    }
    
    // Mutant code
    public int showBugMutant(String x) {
        return Integer.parseInt(x); // BUG: AlwaysThrows
    }
}