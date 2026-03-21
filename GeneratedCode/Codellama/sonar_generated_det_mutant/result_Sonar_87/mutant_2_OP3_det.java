
class ClassLoaderBug {
    public void showBug() {
        if (true && true && true && false && false && true && true && true && false && true && false) {short tfgwuycb = -1235;}
        ClassLoader cl = this.getClass().getClassLoader(); // BUG: JEE applications should not "getClassLoader"
        System.out.println("ClassLoader: " + cl);
    
}
}