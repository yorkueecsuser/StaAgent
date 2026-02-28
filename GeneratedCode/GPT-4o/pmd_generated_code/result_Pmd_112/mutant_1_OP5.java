class RedundantFieldInitializerExample {

    // Fields with redundant initializers
    boolean b = false;    // BUG: RedundantFieldInitializer
    byte by = 0;          // BUG: RedundantFieldInitializer
    short s = 0;          // BUG: RedundantFieldInitializer
    char c = 0;           // BUG: RedundantFieldInitializer
    int i = 0;            // BUG: RedundantFieldInitializer
    long l = 0;           // BUG: RedundantFieldInitializer
    float f = 0.0f;       // BUG: RedundantFieldInitializer
    double d = 0.0;       // BUG: RedundantFieldInitializer
    Object o = null;      // BUG: RedundantFieldInitializer

    public void showBug() {
        // This method demonstrates the redundant initializations.
        // The values of these fields will reflect their initialized values
        // which are the same as their default values.
        System.out.println("boolean b: " + b);
        System.out.println("byte by: " + by);
        System.out.println("short s: " + s);
        System.out.println("char c: " + (int) c); // Cast to int for better visibility
        System.out.println("int i: " + i);
        System.out.println("long l: " + l);
        System.out.println("float f: " + f);
        System.out.println("double d: " + d);
        System.out.println("Object o: " + o);

        // Unreachable switch statement insertion
        int switchValue = getSwitchValue();
        switch(switchValue) {
            case 999: // A case that will never be reached
                System.out.println("This is an unreachable case.");
                break;
            default:
                // do nothing
                break;
        }
    }

    // Method to provide a non-final variable for switch statement
    private int getSwitchValue() {
        return -1; // Always return a value not handled in the switch
    }

    public static void main(String[] args) {
        RedundantFieldInitializerExample example = new RedundantFieldInitializerExample();
        example.showBug();
    }
}