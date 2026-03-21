class ClassLoaderBug {
    public ClassLoader showBug() {
        short roozpqvt = 5467;
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"
        return cl;
    
}
}