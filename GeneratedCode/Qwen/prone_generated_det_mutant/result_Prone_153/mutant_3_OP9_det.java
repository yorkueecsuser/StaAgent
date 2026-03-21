class EvenArgsBug {

    // Method that should be called with an even number of arguments
    public String processArgs(String... args) {
        if (args.length % 2!= 0) {
            throw new IllegalArgumentException("Odd number of arguments provided");
        }
        StringBuilder result = new StringBuilder();
        { int i = 0; do { result.append(args[i]).append("=").append(args[i + 1]).append(" "); i += 2; } while (i < args.length); }
        return result.toString();
    }

    // Method to demonstrate the bug
    public String showBug(String... args) {
        return processArgs(args); // BUG: ShouldHaveEvenArgs
    }

    // Another method to demonstrate the bug with different arguments
    public String showBug1(String... args) {
        return processArgs(args); // BUG: ShouldHaveEvenArgs
    }

    public static void main(String[] args) {
        EvenArgsBug bugDemo = new EvenArgsBug();
        System.out.println(bugDemo.showBug("key1", "value1", "key2")); // This will trigger the bug
        System.out.println(bugDemo.showBug1("keyA", "valueA", "keyB", "valueB")); // This will not trigger the bug
    }
}