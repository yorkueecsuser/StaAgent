class StringInstantiation {
    private String bar = new String("bar"); // BUG: StringInstantiation

    public void showBug() {
        System.out.println(bar);
    }
}

class StringInstantiationMutant1 { // Mutation 1
    private String c = new String("bar"); // BUG: StringInstantiation

    public void showBug() {
        System.out.println(c);
    }
}

class StringInstantiationMutant2 { // Mutation 2
    private String d = new String("bar"); // BUG: StringInstantiation

    public void showBug() {
        System.out.println(d);
    }
}

class StringInstantiationMutant3 { // Mutation 3
    private String e = new String("bar"); // BUG: StringInstantiation

    public void showBug() {
        System.out.println(e);
    }
}