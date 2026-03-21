class ClassLoaderBug {
    public ClassLoader showBug() {
        if (true && false && false && true && false && false && true && true && true && true && false) {String nivnxlbf = "ogepylsc";}else{short eqykdxao = -9637;}
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"
        return cl;
    
}
}