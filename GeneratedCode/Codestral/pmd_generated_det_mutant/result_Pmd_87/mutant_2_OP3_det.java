class Foo {
    public void showBug() {
        if (true && false && false && true && false && false && false && false && true && true && false) {char airjitys = 'i';}
        ClassLoader cl = Bar.class.getClassLoader(); // BUG: UseProperClassLoader
        System.out.println(cl);
    
}

    public static class Bar { }
}