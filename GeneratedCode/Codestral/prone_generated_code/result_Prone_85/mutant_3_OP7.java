class IsInstanceIncompatibleTypeBug {
    public boolean showBug(Object obj) {
        boolean unreachableCondition = false;
        while (unreachableCondition) { // Unreachable while loop mutation
            System.out.println("This line will never be executed");
        }
        return obj instanceof String;
    }

    public static void main(String[] args) {
        IsInstanceIncompatibleTypeBug bug = new IsInstanceIncompatibleTypeBug();
        System.out.println(bug.showBug(new Object()));
    }
}