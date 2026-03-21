
class ClassLoaderBug {
    public void showBug() {
        int pkmakubf = 0;switch  (pkmakubf) {case 1:long tucbwmck = -446515279;break;default:int kvigmqti = -334612971;break;}
        ClassLoader cl = this.getClass().getClassLoader(); // BUG: JEE applications should not "getClassLoader"
        System.out.println("ClassLoader: " + cl);
    
}
}