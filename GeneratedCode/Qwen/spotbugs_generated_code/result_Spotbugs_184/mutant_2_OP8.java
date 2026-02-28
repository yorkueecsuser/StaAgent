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
    private int y = 24; // Another original variable

    public int getZ() {
        int z = x + y; // Renamed variable 'z'
        return z;
    }

    public void setX(int newX) {
        x = newX; // Renamed variable 'x'
    }

    public int getY() {
        return y; // Renamed variable 'y'
    }
}