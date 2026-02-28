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
        
        // Introduced unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This will never be printed because shouldRun is always false.");
        } else {
            System.out.println("This will always be printed instead.");
        }
        
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

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }
}