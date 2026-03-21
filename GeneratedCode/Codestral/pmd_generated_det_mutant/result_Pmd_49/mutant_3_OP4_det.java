class BuggyCode {
    public Class<?> showBug() {
        if (false && true && false && false && false && true && false && false && false && false && false) {boolean sqmrzcru = false;}else{char ucfxcrkx = 'x';}
        Class<?> c = new String().getClass(); // BUG: InstantiationToGetClass
        return c;
    
}
}