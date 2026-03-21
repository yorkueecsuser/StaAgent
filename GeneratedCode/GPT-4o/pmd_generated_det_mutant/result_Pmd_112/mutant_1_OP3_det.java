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
        if (true && true && true && false && true && false && true && true && true && true && false) {double hbxrtppp = 636584820;}
        System.out.println("boolean b: " + b);
        System.out.println("byte by: " + by);
        System.out.println("short s: " + s);
        System.out.println("char c: " + (int) c); // Cast to int for better visibility
        System.out.println("int i: " + i);
        System.out.println("long l: " + l);
        System.out.println("float f: " + f);
        System.out.println("double d: " + d);
        System.out.println("Object o: " + o);
    
}

    public static void main(String[] args) {
        RedundantFieldInitializerExample example = new RedundantFieldInitializerExample();
        example.showBug();
    }
}