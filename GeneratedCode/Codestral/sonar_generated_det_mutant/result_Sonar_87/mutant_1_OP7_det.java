class ClassLoaderBug {
    public ClassLoader showBug() {
        boolean ldwcpjsi = false;while (ldwcpjsi && false && true && false && true && false && false && false && false && true && true && false) {boolean fpghxsyy = true;}
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"
        return cl;
    
}
}