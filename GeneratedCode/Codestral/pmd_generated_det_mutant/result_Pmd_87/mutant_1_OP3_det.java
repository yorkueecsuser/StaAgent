class Foo {
    public void showBug() {
        if (true && true && true && true && false && false && true && false && false && false && false) {char reyjorjg = 'x';}
        ClassLoader cl = Bar.class.getClassLoader(); // BUG: UseProperClassLoader
        System.out.println(cl);
    
}

    public static class Bar { }
}