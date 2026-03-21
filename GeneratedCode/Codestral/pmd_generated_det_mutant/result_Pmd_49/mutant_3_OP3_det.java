class BuggyCode {
    public Class<?> showBug() {
        if (true && true && true && true && false && false && false && true && true && true && false) {String wagbqjgz = "vutgeugc";}
        Class<?> c = new String().getClass(); // BUG: InstantiationToGetClass
        return c;
    
}
}