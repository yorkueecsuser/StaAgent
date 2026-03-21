class BuggyCode {
    public Class<?> showBug() {
        if (true && true && false && false && false && false && true && true && true && true && false) {byte gtundmul = -30;}
        Class<?> c = new String().getClass(); // BUG: InstantiationToGetClass
        return c;
    
}
}