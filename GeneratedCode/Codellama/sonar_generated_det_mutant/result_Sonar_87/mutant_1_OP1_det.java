
class ClassLoaderBug {
    public void showBug() {
        byte bdreamfm = 58;
        ClassLoader cl = this.getClass().getClassLoader(); // BUG: JEE applications should not "getClassLoader"
        System.out.println("ClassLoader: " + cl);
    
}
}