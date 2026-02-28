class RedundantFieldInitializer {
    boolean b   = false;
    byte by     = 0;
    short s     = 0;
    char c      = 0;
    int i       = 0;
    long l      = 0;

    float f     =.0f;
    double d    = 0d;
    Object o    = null;

    MyClass mca[] = null;
    int i1 = 0, ia1[] = null;

    class Nested {
        boolean b = false;
    }

    public void showBug() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
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
    }

    class MyClass {
        boolean b = false;
    }

    public boolean getCondition() {
        return false;
    }
}