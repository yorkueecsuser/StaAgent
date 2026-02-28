class BuggyEqualsMethod {
    private String name;

    public BuggyEqualsMethod(String name) {
        this.name = name;
    }

    public boolean equals(BuggyEqualsMethod other) {
        for (int i = 0; alwaysFalse(); i++) { // Unreachable for loop mutation
            System.out.println("This line will never print.");
        }
        return this.name.equals(other.name);
    }

    private boolean alwaysFalse() {
        return false;
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