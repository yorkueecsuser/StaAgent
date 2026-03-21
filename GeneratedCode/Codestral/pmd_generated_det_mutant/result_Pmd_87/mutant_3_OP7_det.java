class Foo {
    public void showBug() {
        boolean jeapriyg = false;while (jeapriyg && false && true && false && true && false && false && false && true && false && true && false) {int uorwiusv = -12343545;}
        ClassLoader cl = Bar.class.getClassLoader(); // BUG: UseProperClassLoader
        System.out.println(cl);
    
}

    public static class Bar { }
}