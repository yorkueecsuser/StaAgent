class BuggyCode {
    public Class<?> showBug() {
        if (true && false && true && false && false && false && true && true && true && false && false) {long kwpoepah = -46733898;}else{int kocldjaw = -855560682;}
        Class<?> c = new String().getClass(); // BUG: InstantiationToGetClass
        return c;
    
}
}