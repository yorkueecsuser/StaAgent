class RedundantFieldInitializer {
    boolean b;
    byte by;
    short s;
    char c;
    int i;
    long l;

    float f;
    double d;
    Object o;

    MyClass mca[];
    int i1, ia1[];

    class Nested {
        boolean b;
    }

    public void showBug() {
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

    class MyClass {
        boolean b;
    }
}