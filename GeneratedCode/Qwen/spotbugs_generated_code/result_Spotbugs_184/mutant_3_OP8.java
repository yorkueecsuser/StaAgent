class Configuration {
    public static int MAX_CONNECTIONS = 100; // BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL) 

    public int showBug() {
        return MAX_CONNECTIONS;
    }

    public void modifyMaxConnections(int newValue) {
        MAX_CONNECTIONS = newValue; // This method demonstrates that the field can be changed
    }

    // Mutated code with renaming operator applied
    private int a = 42; // Renamed variable 'a' from someVariable

    public int getA() {
        return a;
    }

    public void setA(int b) { // Renamed parameter 'b' from value
        a = b;
    }
}