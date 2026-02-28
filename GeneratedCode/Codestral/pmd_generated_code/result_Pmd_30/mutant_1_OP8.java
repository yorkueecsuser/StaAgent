class ConfusingArgumentToVarargsMethod {
    void varargs(Object... args) {
        for (Object arg : args) {
            System.out.println(arg);
        }
    }

    public Object[] showBug() {
        String[] a = new String[]{"a"};
        varargs(a); // BUG: ConfusingArgumentToVarargsMethod
        Object b = null;
        varargs(b); // BUG: ConfusingArgumentToVarargsMethod
        return new Object[]{"a"};
    }
}