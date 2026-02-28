// BUG: InstantiationToGetClass
class InstantiationToGetClass {
    public Class showBug() {
        Class c1 = new String().getClass(); // BUG: InstantiationToGetClass
        Class c2 = new String().getClass(); // Mutant Code
        return c1;
    }
}