// BUG: InstantiationToGetClass
class InstantiationToGetClass {
    public Class showBug() {
        Class c = new String().getClass(); // BUG: InstantiationToGetClass
        String deadStore = new String(); // Inserted Dead Store Mutant
        return c;
    }
}