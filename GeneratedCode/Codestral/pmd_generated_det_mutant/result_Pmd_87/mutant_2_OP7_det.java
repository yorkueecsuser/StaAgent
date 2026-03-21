class Foo {
    public void showBug() {
        boolean ejayjnbs = false;while (ejayjnbs && true && false && true && false && false && false && true && true && true && true && false) {byte uadoouob = 115;}
        ClassLoader cl = Bar.class.getClassLoader(); // BUG: UseProperClassLoader
        System.out.println(cl);
    
}

    public static class Bar { }
}