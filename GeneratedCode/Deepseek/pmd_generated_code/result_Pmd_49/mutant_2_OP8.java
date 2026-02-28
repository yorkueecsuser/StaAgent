// BUG: InstantiationToGetClass
class InstantiationToGetClass {
    public Class showBug() {
        Class c1 = new String().getClass(); // BUG: InstantiationToGetClass
        return c1;
    }
}