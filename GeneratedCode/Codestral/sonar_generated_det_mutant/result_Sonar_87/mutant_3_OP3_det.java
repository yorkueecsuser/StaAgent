class ClassLoaderBug {
    public ClassLoader showBug() {
        if (true && false && true && true && false && false && true && false && true && false && false) {short cteqzevg = -1334;}
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"
        return cl;
    
}
}