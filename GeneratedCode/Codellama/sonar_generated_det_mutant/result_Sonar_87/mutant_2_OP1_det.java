
class ClassLoaderBug {
    public void showBug() {
        String rcysxlxy = "fllskemw";
        ClassLoader cl = this.getClass().getClassLoader(); // BUG: JEE applications should not "getClassLoader"
        System.out.println("ClassLoader: " + cl);
    
}
}