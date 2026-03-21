class Foo {
    public void showBug() {
        if (false && false && false && true && true && false && false && false && false && false && false) {boolean asiscvpo = false;}else{String pddqmdtw = "mtxartmx";}
        ClassLoader cl = Bar.class.getClassLoader(); // BUG: UseProperClassLoader
        System.out.println(cl);
    
}

    public static class Bar { }
}