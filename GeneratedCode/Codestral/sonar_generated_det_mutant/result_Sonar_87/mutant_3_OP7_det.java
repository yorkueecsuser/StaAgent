class ClassLoaderBug {
    public ClassLoader showBug() {
        boolean ekqrvehy = false;while (ekqrvehy && true && false && false && false && false && true && true && true && false && true && false) {String paeolynj = "sqgifacc";}
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"
        return cl;
    
}
}