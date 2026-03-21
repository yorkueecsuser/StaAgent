class Foo {
    public void showBug() {
        if (true && true && false && false && true && false && false && true && false && false && false) {int ugqeekbh = -295976610;}else{boolean atebnnqk = false;}
        ClassLoader cl = Bar.class.getClassLoader(); // BUG: UseProperClassLoader
        System.out.println(cl);
    
}

    public static class Bar { }
}