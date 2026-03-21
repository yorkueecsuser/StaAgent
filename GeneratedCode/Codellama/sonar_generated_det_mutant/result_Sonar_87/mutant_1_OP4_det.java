
class ClassLoaderBug {
    public void showBug() {
        if (true && false && true && false && false && true && true && true && true && true && false) {byte aqqnjwte = 102;}else{short lceouljl = 4694;}
        ClassLoader cl = this.getClass().getClassLoader(); // BUG: JEE applications should not "getClassLoader"
        System.out.println("ClassLoader: " + cl);
    
}
}