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

        // Duplicate assignment statements
        boolean bCopy = b; // Duplicate b assignment
        byte byCopy = by;  // Duplicate by assignment
        short sCopy = s;   // Duplicate s assignment
        char cCopy = c;    // Duplicate c assignment
        int iCopy = i;     // Duplicate i assignment
        long lCopy = l;    // Duplicate l assignment
        float fCopy = f;   // Duplicate f assignment
        double dCopy = d;  // Duplicate d assignment
        Object oCopy = o;  // Duplicate o assignment

        // Print the duplicated values
        System.out.println("Duplicated boolean bCopy: " + bCopy);
        System.out.println("Duplicated byte byCopy: " + byCopy);
        System.out.println("Duplicated short sCopy: " + sCopy);
        System.out.println("Duplicated char cCopy: " + (int) cCopy);
        System.out.println("Duplicated int iCopy: " + iCopy);
        System.out.println("Duplicated long lCopy: " + lCopy);
        System.out.println("Duplicated float fCopy: " + fCopy);
        System.out.println("Duplicated double dCopy: " + dCopy);
        System.out.println("Duplicated Object oCopy: " + oCopy);
    }

    public static void main(String[] args) {
        RedundantFieldInitializerExample example = new RedundantFieldInitializerExample();
        example.showBug();
    }
}