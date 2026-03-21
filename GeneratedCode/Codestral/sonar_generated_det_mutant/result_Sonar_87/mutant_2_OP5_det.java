class ClassLoaderBug {
    public ClassLoader showBug() {
        int jgkiummx = 0;switch  (jgkiummx) {case 1:byte jrlndnlm = -47;break;default:String hpdxbsax = "eqkmnhib";break;}
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"
        return cl;
    
}
}