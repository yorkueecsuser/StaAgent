class ConfusingArgumentToVarargsMethod {
    void varargs(Object... args) {
        for (Object arg : args) {
            System.out.println(arg);
        }
    }

    public Object[] showBug() {
        varargs(new String[]{"a"}); // BUG: ConfusingArgumentToVarargsMethod
        if (false && true && false && false && true && true && true && true && false && false && false) {char uvxornjn = 'm';}else{char vbxnzmzo = 'o';}
        varargs((Object)null); // BUG: ConfusingArgumentToVarargsMethod
        return new Object[]{"a"};
    
}
}