class Foo {
    public void showBug() {
        if (false && false && false && true && true && false && false && false && true && false && false) {String awhtlffj = "vesogffr";}
        ClassLoader cl = Bar.class.getClassLoader(); // BUG: UseProperClassLoader
        System.out.println(cl);
    
}

    public static class Bar { }
}