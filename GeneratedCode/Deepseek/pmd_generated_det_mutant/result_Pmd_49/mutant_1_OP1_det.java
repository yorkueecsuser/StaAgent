// BUG: InstantiationToGetClass
class InstantiationToGetClass {
    public Class showBug() {
        short odpzmbcl = -7749;
        Class c = new String().getClass(); // BUG: InstantiationToGetClass
        return c;
    
}
}