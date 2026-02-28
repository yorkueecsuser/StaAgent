// Mutated Java code with Unreachable switch statement mutation operator

class BuggyClass {
    private static int[] numbers = {1, 2, 3, 4, 5};

    public static int[] getNumbers() {
        int unreachableValue = getUnreachableValue(); // Assume this method always returns a value that is not 1
        switch (unreachableValue) {
            case 1:
                System.out.println("This line should never be executed.");
                break;
        }
        return numbers; // BUG: Still present, MS: Public static method may expose internal representation by returning a mutable object or array (MS_EXPOSE_REP)
    }

    private static int getUnreachableValue() {
        // This method should always return a value that is not 1
        // For simplicity, let's just return 2
        return 2;
    }

    // Rest of the code is the same as before
    //...
}