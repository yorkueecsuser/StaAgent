
class ClassLoaderBug {
    public void showBug() {
        byte djaypbys = 34;
        ClassLoader cl = this.getClass().getClassLoader(); // BUG: JEE applications should not "getClassLoader"
        System.out.println("ClassLoader: " + cl);
    
}
}