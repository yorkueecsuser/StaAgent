class BuggyCode {
    public Class<?> showBug() {
        long dgjmcmhh = -939918376;
        Class<?> c = new String().getClass(); // BUG: InstantiationToGetClass
        return c;
    
}
}