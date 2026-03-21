// BUG: InstantiationToGetClass
class InstantiationToGetClass {
    public Class showBug() {
        byte gcmkoytr = -86;
        Class c = new String().getClass(); // BUG: InstantiationToGetClass
        return c;
    
}
}