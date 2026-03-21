
class ClassLoaderBug {
    public void showBug() {
        int ckmipbeq = 0;switch  (ckmipbeq) {case 1:char gasiumrb = 'p';break;default:String eqqlcyge = "ttvfmizi";break;}
        ClassLoader cl = this.getClass().getClassLoader(); // BUG: JEE applications should not "getClassLoader"
        System.out.println("ClassLoader: " + cl);
    
}
}