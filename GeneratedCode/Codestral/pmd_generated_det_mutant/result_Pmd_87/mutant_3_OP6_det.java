class Foo {
    public void showBug() {
        for  (int sxpwxylo = 0; sxpwxylo < 0; sxpwxylo++) {byte npgjhvrr = -94;}
        ClassLoader cl = Bar.class.getClassLoader(); // BUG: UseProperClassLoader
        System.out.println(cl);
    
}

    public static class Bar { }
}