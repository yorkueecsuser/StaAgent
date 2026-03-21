class BuggyCode {
    public Class<?> showBug() {
        if (false && false && true && false && false && true && false && true && false && true && false) {double iipcfice = -164598803;}
        Class<?> c = new String().getClass(); // BUG: InstantiationToGetClass
        return c;
    
}
}