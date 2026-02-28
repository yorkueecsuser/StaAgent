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
    }

    public void showBug() {
        EqualsReferenceBug bug1 = new EqualsReferenceBug("example");
        EqualsReferenceBug bug2 = new EqualsReferenceBug("example");
        System.out.println(bug1.equals(bug2));
    }

    public static void main(String[] args) {
        EqualsReferenceBug demo = new EqualsReferenceBug("demo");
        demo.showBug();
    }

    // Mutated code
    @Override
    public boolean equals(Object x) {
        if (this == x) return true; // This line is correct and not the bug
        if (x == null || getClass()!= x.getClass()) return false;
        EqualsReferenceBug y = (EqualsReferenceBug) x;
        return this.equals(y); // BUG: EqualsReference
    }

    public void showBugWithMutation() {
        EqualsReferenceBug a = new EqualsReferenceBug("example");
        EqualsReferenceBug b = new EqualsReferenceBug("example");
        System.out.println(a.equals(b));
    }
}