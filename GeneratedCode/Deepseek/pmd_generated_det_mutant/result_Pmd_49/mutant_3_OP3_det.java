// BUG: InstantiationToGetClass
class InstantiationToGetClass {
    public Class showBug() {
        if (true && true && false && true && false && true && true && true && true && true && false) {byte gyesvyuq = -114;}
        Class c = new String().getClass(); // BUG: InstantiationToGetClass
        return c;
    
}
}