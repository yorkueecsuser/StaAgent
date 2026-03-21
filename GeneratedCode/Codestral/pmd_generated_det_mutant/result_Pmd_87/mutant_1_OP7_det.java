class Foo {
    public void showBug() {
        boolean eqtvydcn = false;while (eqtvydcn && false && true && false && false && false && false && true && false && false && true && false) {long fkpynefc = -692847975;}
        ClassLoader cl = Bar.class.getClassLoader(); // BUG: UseProperClassLoader
        System.out.println(cl);
    
}

    public static class Bar { }
}