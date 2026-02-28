class InstanceOfClassBug {

    public <A, B> boolean showBug(Class<A> lhs, Class<B> rhs) {
        // Here we are incorrectly using the isInstance method with a Class object instead of an instance
        boolean unreachableBranchCondition = getCondition();
        if (unreachableBranchCondition) {
            // This block is unreachable in practice, but syntactically correct.
            System.out.println("This is an unreachable code block.");
        } else {
            // Original code
            return lhs.isInstance(rhs); // BUG: IsInstanceOfClass
        }
        return false; // Default return to maintain method signature
    }

    // A method to simulate a condition that is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        InstanceOfClassBug bugDemo = new InstanceOfClassBug();
        boolean result = bugDemo.showBug(String.class, Integer.class);
        System.out.println("The result of the buggy method is: " + result);
    }
}