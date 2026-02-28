class EqualsReferenceBug {

    private String name;

    public EqualsReferenceBug(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // This line is correct and not the bug
        if (obj == null || getClass()!= obj.getClass()) return false;
        EqualsReferenceBug that = (EqualsReferenceBug) obj;
        return this.equals(that); // BUG: EqualsReference

        // Mutant code with renaming
        EqualsReferenceBug x = (EqualsReferenceBug) obj;
        return this.equals(x);
    }

    public void showBug() {
        EqualsReferenceBug bug1 = new EqualsReferenceBug("example");
        EqualsReferenceBug bug2 = new EqualsReferenceBug("example");
        System.out.println(bug1.equals(bug2));

        // Mutant code with renaming
        EqualsReferenceBug a = new EqualsReferenceBug("example");
        EqualsReferenceBug b = new EqualsReferenceBug("example");
        System.out.println(a.equals(b));
    }

    public static void main(String[] args) {
        EqualsReferenceBug demo = new EqualsReferenceBug("demo");
        demo.showBug();

        // Mutant code with renaming
        EqualsReferenceBug c = new EqualsReferenceBug("demo");
        c.showBug();
    }
}