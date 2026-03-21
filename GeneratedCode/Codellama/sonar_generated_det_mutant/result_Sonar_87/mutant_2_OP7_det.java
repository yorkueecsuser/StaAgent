
class ClassLoaderBug {
    public void showBug() {
        boolean cwzuwjmz = false;while (cwzuwjmz && false && true && true && true && false && true && true && false && true && false && false) {short zkrdfgoy = 3729;}
        ClassLoader cl = this.getClass().getClassLoader(); // BUG: JEE applications should not "getClassLoader"
        System.out.println("ClassLoader: " + cl);
    
}
}