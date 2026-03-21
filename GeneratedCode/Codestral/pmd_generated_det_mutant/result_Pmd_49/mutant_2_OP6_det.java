class BuggyCode {
    public Class<?> showBug() {
        for  (int xjwvsplm = 0; xjwvsplm < 0; xjwvsplm++) {int bayzrzzo = -220148835;}
        Class<?> c = new String().getClass(); // BUG: InstantiationToGetClass
        return c;
    
}
}