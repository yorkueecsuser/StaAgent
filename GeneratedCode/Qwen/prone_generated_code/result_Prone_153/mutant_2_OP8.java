class EvenArgsBug {

    // Method that should be called with an even number of arguments
    public String processArgs(String... args) {
        if (args.length % 2!= 0) {
            throw new IllegalArgumentException("Odd number of arguments provided");
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < args.length; i += 2) {
            result.append(args[i]).append("=").append(args[i + 1]).append(" ");
        }
        return result.toString();
    }

    // Mutated method with renamed variable
    public String processArgsMutated(String... x) {
        if (x.length % 2!= 0) {
            throw new IllegalArgumentException("Odd number of arguments provided");
        }
        StringBuilder y = new StringBuilder();
        for (int z = 0; z < x.length; z += 2) {
            y.append(x[z]).append("=").append(x[z + 1]).append(" ");
        }
        return y.toString();
    }

    // Method to demonstrate the bug
    public String showBug(String... args) {
        return processArgs(args); // BUG: ShouldHaveEvenArgs
    }

    // Mutated method to demonstrate the bug with renamed variable
    public String showBugMutated(String... x) {
        return processArgsMutated(x); // BUG: ShouldHaveEvenArgs
    }

    // Another method to demonstrate the bug with different arguments
    public String showBug1(String... args) {
        return processArgs(args); // BUG: ShouldHaveEvenArgs
    }

    // Mutated method to demonstrate the bug with different arguments and renamed variable
    public String showBug1Mutated(String... x) {
        return processArgsMutated(x); // BUG: ShouldHaveEvenArgs
    }

    public static void main(String[] args) {
        EvenArgsBug bugDemo = new EvenArgsBug();
        System.out.println(bugDemo.showBug("key1", "value1", "key2")); // This will trigger the bug
        System.out.println(bugDemo.showBug1("keyA", "valueA", "keyB", "valueB")); // This will not trigger the bug
        System.out.println(bugDemo.showBugMutated("key1", "value1", "key2")); // This will trigger the bug
        System.out.println(bugDemo.showBug1Mutated("keyA", "valueA", "keyB", "valueB")); // This will not trigger the bug
    }
}