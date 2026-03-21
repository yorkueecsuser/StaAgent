class BuggyCode {
    public Class<?> showBug() {
        boolean bvfplrng = false;while (bvfplrng && false && true && true && false && true && false && true && false && true && true && false) {char ubjtseaw = 'i';}
        Class<?> c = new String().getClass(); // BUG: InstantiationToGetClass
        return c;
    
}
}