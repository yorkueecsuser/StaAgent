class Foo {
    public void showBug() {
        float pcollwmd = -805223228;
        ClassLoader cl = Bar.class.getClassLoader(); // BUG: UseProperClassLoader
        System.out.println(cl);
    
}

    public static class Bar { }
}