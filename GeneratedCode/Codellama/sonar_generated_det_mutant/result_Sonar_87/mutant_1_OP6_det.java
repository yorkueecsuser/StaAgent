
class ClassLoaderBug {
    public void showBug() {
        for  (int vwjhsouz = 0; vwjhsouz < 0; vwjhsouz++) {long kqeehnqn = 787448026;}
        ClassLoader cl = this.getClass().getClassLoader(); // BUG: JEE applications should not "getClassLoader"
        System.out.println("ClassLoader: " + cl);
    
}
}