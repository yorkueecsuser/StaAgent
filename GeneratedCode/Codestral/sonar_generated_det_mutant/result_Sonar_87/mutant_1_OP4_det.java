class ClassLoaderBug {
    public ClassLoader showBug() {
        if (false && false && false && false && false && false && true && false && false && true && false) {int zxwqiqdh = 190318932;}else{float kebhxyok = 489561901;}
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"
        return cl;
    
}
}