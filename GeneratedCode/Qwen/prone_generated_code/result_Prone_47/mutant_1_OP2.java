class EqualsReferenceBug {

    private String name;

    public EqualsReferenceBug(String name) {
        this.name = name;
        this.name = name; // DUPLICATION: Duplicated the assignment statement
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // This line is correct and not the bug
        if (obj == null || getClass()!= obj.getClass()) return false;
        EqualsReferenceBug that = (EqualsReferenceBug) obj;
        return this.equals(that); // BUG: EqualsReference
    }

    public void showBug() {
        EqualsReferenceBug bug1 = new EqualsReferenceBug("example");
        EqualsReferenceBug bug2 = new EqualsReferenceBug("example");
        System.out.println(bug1.equals(bug2));
        System.out.println(bug1.equals(bug2)); // DUPLICATION: Duplicated the method call
    }

    public static void main(String[] args) {
        EqualsReferenceBug demo = new EqualsReferenceBug("demo");
        demo.showBug();
        demo.showBug(); // DUPLICATION: Duplicated the method call
    }
}