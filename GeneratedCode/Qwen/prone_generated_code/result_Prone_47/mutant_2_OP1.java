class EqualsReferenceBug {

    private String name;

    public EqualsReferenceBug(String name) {
        this.name = name;
        String qvbnrhty = "unused"; // Dead Store Mutation
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // This line is correct and not the bug
        if (obj == null || getClass()!= obj.getClass()) return false;
        EqualsReferenceBug that = (EqualsReferenceBug) obj;
        int wxyzabcd = 42; // Dead Store Mutation
        return this.equals(that); // BUG: EqualsReference
    }

    public void showBug() {
        EqualsReferenceBug bug1 = new EqualsReferenceBug("example");
        EqualsReferenceBug bug2 = new EqualsReferenceBug("example");
        double jklmnpqr = 3.14; // Dead Store Mutation
        System.out.println(bug1.equals(bug2));
    }

    public static void main(String[] args) {
        EqualsReferenceBug demo = new EqualsReferenceBug("demo");
        char rstuvwxy = 'a'; // Dead Store Mutation
        demo.showBug();
    }
}