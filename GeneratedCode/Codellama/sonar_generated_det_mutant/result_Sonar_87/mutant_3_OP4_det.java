
class ClassLoaderBug {
    public void showBug() {
        if (true && false && false && false && false && true && true && false && false && true && false) {long qbtfgxas = -971732846;}else{char jkdzaali = 'q';}
        ClassLoader cl = this.getClass().getClassLoader(); // BUG: JEE applications should not "getClassLoader"
        System.out.println("ClassLoader: " + cl);
    
}
}