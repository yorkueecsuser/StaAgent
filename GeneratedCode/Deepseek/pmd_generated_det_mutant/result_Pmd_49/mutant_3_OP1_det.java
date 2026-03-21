// BUG: InstantiationToGetClass
class InstantiationToGetClass {
    public Class showBug() {
        byte mhrmpsdg = 37;
        Class c = new String().getClass(); // BUG: InstantiationToGetClass
        return c;
    
}
}