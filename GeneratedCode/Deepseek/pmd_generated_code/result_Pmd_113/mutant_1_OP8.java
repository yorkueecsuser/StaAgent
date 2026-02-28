class StringInstantiation {
    private String bar = new String("bar"); // BUG: StringInstantiation

    public void showBug() {
        System.out.println(bar);
    }
}

// Mutated Java code
class StringInstantiationMutated {
    private String foo = new String("bar"); // MUTANT: Renaming

    public void showBugMutant() {
        System.out.println(foo);
    }
}