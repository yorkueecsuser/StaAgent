// BUG: InstantiationToGetClass
class InstantiationToGetClass {
    public Class showBug() {
        if (false && false && false && false && true && true && false && true && true && false && false) {char pyjuhemh = 'i';}
        Class c = new String().getClass(); // BUG: InstantiationToGetClass
        return c;
    
}
}