class ClassLoaderBug {
    public ClassLoader showBug() {
        if (true && true && false && true && false && true && false && true && false && false && false) {double ihwgrnlx = -307443855;}
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"
        return cl;
    
}
}