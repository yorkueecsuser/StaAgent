class ClassLoaderBug {
    public ClassLoader showBug() {
        for  (int uzkzrjpu = 0; uzkzrjpu < 0; uzkzrjpu++) {float tpnimbcx = 153158104;}
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"
        return cl;
    
}
}