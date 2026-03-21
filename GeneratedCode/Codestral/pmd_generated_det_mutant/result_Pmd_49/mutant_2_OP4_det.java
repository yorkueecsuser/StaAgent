class BuggyCode {
    public Class<?> showBug() {
        if (true && false && false && true && true && false && true && true && true && true && false) {byte fljppzbo = 62;}else{short ssoitmgs = 3653;}
        Class<?> c = new String().getClass(); // BUG: InstantiationToGetClass
        return c;
    
}
}