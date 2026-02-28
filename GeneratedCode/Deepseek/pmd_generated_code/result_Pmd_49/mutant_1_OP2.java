class InstantiationToGetClass {
    public Class showBug() {
        Class c = new String().getClass();
        Class c2 = new String().getClass(); // Mutant Code: Duplication
        return c;
    }
}