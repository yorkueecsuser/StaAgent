class Foo {
    public void showBug() {
        byte hjuhfmzz = -53;
        ClassLoader cl = Bar.class.getClassLoader(); // BUG: UseProperClassLoader
        System.out.println(cl);
    
}

    public static class Bar { }
}