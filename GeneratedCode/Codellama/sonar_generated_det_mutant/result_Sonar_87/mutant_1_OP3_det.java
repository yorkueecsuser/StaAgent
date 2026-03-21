
class ClassLoaderBug {
    public void showBug() {
        if (false && true && false && false && false && true && false && false && true && true && false) {float qoutcbcl = -22723985;}
        ClassLoader cl = this.getClass().getClassLoader(); // BUG: JEE applications should not "getClassLoader"
        System.out.println("ClassLoader: " + cl);
    
}
}