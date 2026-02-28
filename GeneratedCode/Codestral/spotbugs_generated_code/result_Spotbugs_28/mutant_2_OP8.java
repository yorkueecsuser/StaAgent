class BuggyEqualsMethod {
    private String nameVar; // Mutation: Original variable name 'name' is renamed to 'nameVar'

    public BuggyEqualsMethod(String nameVar) {
        this.nameVar = nameVar;
    }

    // BUG: Eq: equals() method defined that doesn't override Object.equals(Object) (EQ_OTHER_USE_OBJECT)
    public boolean equals(BuggyEqualsMethod other) {
        return this.nameVar.equals(other.nameVar); // Mutation: 'name' is replaced with 'nameVar'
    }

    public void showBug() {
        BuggyEqualsMethod obj1 = new BuggyEqualsMethod("Object");
        Object obj2 = new BuggyEqualsMethod("Object");

        System.out.println("Using equals(Object): " + obj1.equals(obj2)); // Should print false, but prints true due to bug
        System.out.println("Using equals(BuggyEqualsMethod): " + obj1.equals(new BuggyEqualsMethod("Object"))); // Should print true
    }

    public static void main(String[] args) {
        BuggyEqualsMethod buggyObj = new BuggyEqualsMethod("");
        buggyObj.showBug();
    }
}