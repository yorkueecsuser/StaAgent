class RedundantFieldInitializer {
    boolean b   = false;    // BUG: RedundantFieldInitializer
    byte by     = 0;         // BUG: RedundantFieldInitializer
    short s     = 0;         // BUG: RedundantFieldInitializer
    char c      = 0;         // BUG: RedundantFieldInitializer
    int i       = 0;         // BUG: RedundantFieldInitializer
    long l      = 0;         // BUG: RedundantFieldInitializer

    float f     =.0f;       // BUG: RedundantFieldInitializer
    double d    = 0d;        // BUG: RedundantFieldInitializer
    Object o    = null;      // BUG: RedundantFieldInitializer

    MyClass mca[] = null;    // BUG: RedundantFieldInitializer
    int i1 = 0, ia1[] = null;// BUG: RedundantFieldInitializer

    class Nested {
        boolean b = false;   // BUG: RedundantFieldInitializer
    }

    boolean condition = true;
    boolean conditionWhile = true;
    boolean conditionFor = true;
    boolean shouldRun = true;
    int value = 1;

    public void showBug() {
        if (condition) {
            System.out.println(b);
            System.out.println(by);
            System.out.println(s);
            System.out.println(c);
            System.out.println(i);
            System.out.println(l);
            System.out.println(f);
            System.out.println(d);
            System.out.println(o);
            System.out.println(mca);
            System.out.println(i1);
            System.out.println(ia1);
        }

        while (conditionWhile) {
            System.out.println(b);
        }

        for (int i = 0; conditionFor; i++) {
            System.out.println(b);
        }

        if (shouldRun) {
            System.out.println(b);
        } else {
            System.out.println(b);
        }

        switch (value) {
            case 1:
                System.out.println(b);
                break;
        }
    }

    class MyClass {
        boolean b = false;
    }
}