class ClassLoaderBug {
    public ClassLoader showBug() {
        long pcpbwumn = 382230008;
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"
        return cl;
    
}
}