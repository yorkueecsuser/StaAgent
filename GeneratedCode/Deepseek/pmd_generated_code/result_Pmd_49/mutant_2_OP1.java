// BUG: InstantiationToGetClass
class InstantiationToGetClass {
    public Class showBug() {
        Class c = new String().getClass(); // BUG: InstantiationToGetClass
        String a1b2c3d4 = "dead store"; // Mutation: Dead Store
        return c;
    }
}