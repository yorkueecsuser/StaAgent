class ClassLoaderBug {
    public ClassLoader showBug() {
        if (false && false && false && false && true && true && true && true && true && true && false) {String etfeelvf = "onmxlbrd";}
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"
        return cl;
    
}
}