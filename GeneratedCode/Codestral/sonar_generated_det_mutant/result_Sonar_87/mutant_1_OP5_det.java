class ClassLoaderBug {
    public ClassLoader showBug() {
        int ksvpdpdq = 0;switch  (ksvpdpdq) {case 1:long necqscsj = -309432528;break;default:byte biuqmwke = 66;break;}
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"
        return cl;
    
}
}