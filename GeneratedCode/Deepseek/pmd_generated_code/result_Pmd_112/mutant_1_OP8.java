class RedundantFieldInitializer {
    boolean b1   = false;    // MUTANT: RedundantFieldInitializer
    byte by1     = 0;         // MUTANT: RedundantFieldInitializer
    short s1     = 0;         // MUTANT: RedundantFieldInitializer
    char c1      = 0;         // MUTANT: RedundantFieldInitializer
    int i1       = 0;         // MUTANT: RedundantFieldInitializer
    long l1      = 0;         // MUTANT: RedundantFieldInitializer

    float f1     =.0f;       // MUTANT: RedundantFieldInitializer
    double d1    = 0d;        // MUTANT: RedundantFieldInitializer
    Object o1    = null;      // MUTANT: RedundantFieldInitializer

    MyClass1 mca1[] = null;    // MUTANT: RedundantFieldInitializer
    int i11 = 0, ia11[] = null;// MUTANT: RedundantFieldInitializer

    class Nested {
        boolean b1 = false;   // MUTANT: RedundantFieldInitializer
    }

    public void showBug() {
        System.out.println(b1);
        System.out.println(by1);
        System.out.println(s1);
        System.out.println(c1);
        System.out.println(i1);
        System.out.println(l1);
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(o1);
        System.out.println(mca1);
        System.out.println(i11);
        System.out.println(ia11);
    }

    class MyClass1 {
        boolean b = false;
    }
}