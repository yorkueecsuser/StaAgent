
class ClassLoaderBug {
    public void showBug() {
        boolean knlcohpn = false;while (knlcohpn && false && true && true && true && true && false && true && false && false && true && false) {String ybqhgxtb = "nkvigkbh";}
        ClassLoader cl = this.getClass().getClassLoader(); // BUG: JEE applications should not "getClassLoader"
        System.out.println("ClassLoader: " + cl);
    
}
}