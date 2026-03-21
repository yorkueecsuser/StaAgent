class ClassLoaderBug {
    public ClassLoader showBug() {
        boolean droqpgzq = false;while (droqpgzq && false && false && false && true && true && false && false && true && true && false && false) {double lpjqqzzu = 328875922;}
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"
        return cl;
    
}
}