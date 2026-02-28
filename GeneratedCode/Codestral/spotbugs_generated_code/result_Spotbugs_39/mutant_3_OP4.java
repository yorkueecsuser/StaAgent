class EqualBugExample {
    private String name;
    private boolean unreachableCondition = false; // Added non-final variable

    public EqualBugExample(String name) {
        this.name = name;
    }

    public boolean equal(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass()!= obj.getClass())
            return false;
        EqualBugExample that = (EqualBugExample) obj;

        // Mutant: Unreachable if-else statement
        if (unreachableCondition) { // Using the non-final variable
            throw new RuntimeException("This branch should be unreachable!");
        } else {
            return name!= null? name.equals(that.name) : that.name == null;
        }
    }

    public void showBug(EqualBugExample other) {
        System.out.println("Equal method result: " + equal(other));
        System.out.println("Equals method result: " + equals(other));
    }
}