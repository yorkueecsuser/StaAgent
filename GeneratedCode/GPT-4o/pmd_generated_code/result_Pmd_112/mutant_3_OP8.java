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

    // Mutant: Renaming a user-defined variable
    boolean a = false;    // Renamed from 'b'
    byte x = 0;           // Renamed from 'by'
    short y = 0;          // Renamed from 's'
    char z = 0;           // Renamed from 'c'
    int j = 0;            // Renamed from 'i'
    long m = 0;           // Renamed from 'l'
    float n = 0.0f;       // Renamed from 'f'
    double p = 0.0;       // Renamed from 'd'
    Object q = null;      // Renamed from 'o'

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

        // Demonstrating renamed variables
        System.out.println("boolean a: " + a);
        System.out.println("byte x: " + x);
        System.out.println("short y: " + y);
        System.out.println("char z: " + (int) z); // Cast to int for better visibility
        System.out.println("int j: " + j);
        System.out.println("long m: " + m);
        System.out.println("float n: " + n);
        System.out.println("double p: " + p);
        System.out.println("Object q: " + q);
    }

    public static void main(String[] args) {
        RedundantFieldInitializerExample example = new RedundantFieldInitializerExample();
        example.showBug();
    }
}