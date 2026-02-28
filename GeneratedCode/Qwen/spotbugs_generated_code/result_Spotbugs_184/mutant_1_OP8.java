class Configuration {
    public static int MAX_CONNECTIONS = 100; // BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL) 

    public int showBug() {
        return MAX_CONNECTIONS;
    }

    public void modifyMaxConnections(int newValue) {
        MAX_CONNECTIONS = newValue; // This method demonstrates that the field can be changed
    }

    // Mutated code starts here
    private int x = 42; // Original variable
    private int y = x + 10; // Variable to be renamed

    public int calculateY() {
        int z = y * 2; // Another variable to be renamed
        return z;
    }
}

// Mutated code continues here
class Helper {
    private int a = 15; // Original variable
    private int b = a - 5; // Variable to be renamed

    public int computeB() {
        int c = b + 3; // Another variable to be renamed
        return c;
    }
}