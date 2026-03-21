
class ClassLoaderBug {
    public void showBug() {
        if (true && true && true && true && true && false && true && false && false && true && false) {float dqwjmxyh = 393922176;}else{short urlfjcse = 901;}
        ClassLoader cl = this.getClass().getClassLoader(); // BUG: JEE applications should not "getClassLoader"
        System.out.println("ClassLoader: " + cl);
    
}
}