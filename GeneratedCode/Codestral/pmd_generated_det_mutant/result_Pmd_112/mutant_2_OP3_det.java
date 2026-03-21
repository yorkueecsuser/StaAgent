class RedundantFieldInitializerBug {
    boolean b = false; // BUG: RedundantFieldInitializer
    byte by = 0; // BUG: RedundantFieldInitializer
    short s = 0; // BUG: RedundantFieldInitializer
    char c = 0; // BUG: RedundantFieldInitializer
    int i = 0; // BUG: RedundantFieldInitializer
    long l = 0; // BUG: RedundantFieldInitializer
    float f =.0f; // BUG: RedundantFieldInitializer
    double d = 0d; // BUG: RedundantFieldInitializer
    Object o = null; // BUG: RedundantFieldInitializer

    MyClass mca[] = null; // BUG: RedundantFieldInitializer
    int i1 = 0, ia1[] = null; // BUG: RedundantFieldInitializer

    class Nested {
        boolean b = false; // BUG: RedundantFieldInitializer
    }

    public void showBug() {
        System.out.println("b: " + b);
        System.out.println("by: " + by);
        System.out.println("s: " + s);
        System.out.println("c: " + c);
        System.out.println("i: " + i);
        if (true && false && false && false && true && false && true && true && true && false && false) {int fbsduxan = 869748285;}
        System.out.println("l: " + l);
        System.out.println("f: " + f);
        System.out.println("d: " + d);
        System.out.println("o: " + o);
        System.out.println("mca: " + mca);
        System.out.println("i1: " + i1);
        System.out.println("ia1: " + ia1);
        System.out.println("Nested.b: " + new Nested().b);
    
}

    private static class MyClass {}
}