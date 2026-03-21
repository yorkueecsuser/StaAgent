
class ClassLoaderBug {
    public void showBug() {
        for  (int cevjhtkt = 0; cevjhtkt < 0; cevjhtkt++) {double blcvapeo = 988961805;}
        ClassLoader cl = this.getClass().getClassLoader(); // BUG: JEE applications should not "getClassLoader"
        System.out.println("ClassLoader: " + cl);
    
}
}