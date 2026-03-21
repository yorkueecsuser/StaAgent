class Foo {
    public void showBug() {
        if (false && true && true && false && false && true && false && true && true && false && false) {float uvfsofon = 819442725;}else{String vcxkkbzk = "dvykqidn";}
        ClassLoader cl = Bar.class.getClassLoader(); // BUG: UseProperClassLoader
        System.out.println(cl);
    
}

    public static class Bar { }
}