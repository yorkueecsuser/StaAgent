// BUG: InstantiationToGetClass
class InstantiationToGetClass {
    public Class showBug() {
        Class d = new String().getClass(); // BUG: InstantiationToGetClass (mutant)
        return d;
    }
}