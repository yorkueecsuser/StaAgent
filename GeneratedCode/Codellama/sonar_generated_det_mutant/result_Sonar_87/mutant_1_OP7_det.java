
class ClassLoaderBug {
    public void showBug() {
        boolean vfgwubya = false;while (vfgwubya && true && false && true && false && true && false && false && false && false && false && false) {byte bipoymqe = 6;}
        ClassLoader cl = this.getClass().getClassLoader(); // BUG: JEE applications should not "getClassLoader"
        System.out.println("ClassLoader: " + cl);
    
}
}