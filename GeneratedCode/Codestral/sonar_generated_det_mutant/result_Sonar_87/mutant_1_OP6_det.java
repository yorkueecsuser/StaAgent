class ClassLoaderBug {
    public ClassLoader showBug() {
        for  (int slysoqox = 0; slysoqox < 0; slysoqox++) {long srqcoshw = -531894004;}
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"
        return cl;
    
}
}