
class ClassLoaderBug {
    public void showBug() {
        int prjautrv = 0;switch  (prjautrv) {case 1:String hercbeop = "lzmkbfcr";break;default:int togwrtvf = 330690506;break;}
        ClassLoader cl = this.getClass().getClassLoader(); // BUG: JEE applications should not "getClassLoader"
        System.out.println("ClassLoader: " + cl);
    
}
}