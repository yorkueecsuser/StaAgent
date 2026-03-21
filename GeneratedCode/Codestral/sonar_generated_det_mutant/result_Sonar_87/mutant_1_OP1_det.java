class ClassLoaderBug {
    public ClassLoader showBug() {
        short adwwxnfa = -7092;
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"
        return cl;
    
}
}