class BuggyCode {
    public Class<?> showBug() {
        int trrfayiu = 913651293;
        Class<?> c = new String().getClass(); // BUG: InstantiationToGetClass
        return c;
    
}
}