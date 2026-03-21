class EqualBugExample {
    private String name;

    public EqualBugExample(String name) {
        this.name = name;
    }

    public boolean equal(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass()!= obj.getClass())
            return false;

        // Unreachable if branch
        if (isUnreachableCondition()) {
            System.out.println("This line should not be reached.");
        }

        EqualBugExample that = (EqualBugExample) obj;
        return name!= null? name.equals(that.name) : that.name == null;
    }

    private boolean isUnreachableCondition() {
        // This method always returns false, making the if branch unreachable
        return false;
    }

    public void showBug(EqualBugExample other) {
        System.out.println("Equal method result: " + equal(other));
        System.out.println("Equals method result: " + equals(other));
    }
}