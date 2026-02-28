class Foo {
    public void showBug() {
        ClassLoader cl = Bar.class.getClassLoader(); // BUG: UseProperClassLoader
        System.out.println(cl);
    }

    public static class Bar { }
}