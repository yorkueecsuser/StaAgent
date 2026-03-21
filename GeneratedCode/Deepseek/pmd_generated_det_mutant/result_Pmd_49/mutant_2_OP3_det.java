// BUG: InstantiationToGetClass
class InstantiationToGetClass {
    public Class showBug() {
        if (true && false && true && true && false && false && false && false && true && false && false) {String opcuupot = "szzajraq";}
        Class c = new String().getClass(); // BUG: InstantiationToGetClass
        return c;
    
}
}