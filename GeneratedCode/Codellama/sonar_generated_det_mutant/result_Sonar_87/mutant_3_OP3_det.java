
class ClassLoaderBug {
    public void showBug() {
        if (false && true && true && false && true && true && true && true && true && false && false) {long sykfphwc = 609649394;}
        ClassLoader cl = this.getClass().getClassLoader(); // BUG: JEE applications should not "getClassLoader"
        System.out.println("ClassLoader: " + cl);
    
}
}