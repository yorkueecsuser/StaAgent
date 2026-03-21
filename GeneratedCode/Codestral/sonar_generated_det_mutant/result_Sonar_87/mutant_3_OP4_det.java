class ClassLoaderBug {
    public ClassLoader showBug() {
        if (false && true && false && false && true && true && true && true && false && false && false) {boolean upbcnetw = true;}else{int vxjltytz = -459125129;}
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"
        return cl;
    
}
}