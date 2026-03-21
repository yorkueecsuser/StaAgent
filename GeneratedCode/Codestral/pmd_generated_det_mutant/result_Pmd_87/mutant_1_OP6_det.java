class Foo {
    public void showBug() {
        for  (int zpryismr = 0; zpryismr < 0; zpryismr++) {char sgppyrmk = 'r';}
        ClassLoader cl = Bar.class.getClassLoader(); // BUG: UseProperClassLoader
        System.out.println(cl);
    
}

    public static class Bar { }
}