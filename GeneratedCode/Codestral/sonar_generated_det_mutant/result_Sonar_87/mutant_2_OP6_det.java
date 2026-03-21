class ClassLoaderBug {
    public ClassLoader showBug() {
        for  (int gnksdjni = 0; gnksdjni < 0; gnksdjni++) {long xyxpsvtu = -342623529;}
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"
        return cl;
    
}
}