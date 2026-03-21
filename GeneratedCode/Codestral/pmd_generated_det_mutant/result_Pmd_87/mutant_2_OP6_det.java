class Foo {
    public void showBug() {
        for  (int oeoqztpn = 0; oeoqztpn < 0; oeoqztpn++) {char notvxihz = 'n';}
        ClassLoader cl = Bar.class.getClassLoader(); // BUG: UseProperClassLoader
        System.out.println(cl);
    
}

    public static class Bar { }
}