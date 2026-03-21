class BuggyCode {
    public Class<?> showBug() {
        char owqtyebz = 'b';
        Class<?> c = new String().getClass(); // BUG: InstantiationToGetClass
        return c;
    
}
}