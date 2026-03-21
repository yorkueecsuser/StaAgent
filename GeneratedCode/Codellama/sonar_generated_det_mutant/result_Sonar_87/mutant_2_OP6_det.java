
class ClassLoaderBug {
    public void showBug() {
        for  (int xxwziowo = 0; xxwziowo < 0; xxwziowo++) {long hnlmlfch = -11597904;}
        ClassLoader cl = this.getClass().getClassLoader(); // BUG: JEE applications should not "getClassLoader"
        System.out.println("ClassLoader: " + cl);
    
}
}