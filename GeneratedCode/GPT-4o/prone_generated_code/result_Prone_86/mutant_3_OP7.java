class InstanceOfClassBug {

    public <A, B> boolean showBug(Class<A> lhs, Class<B> rhs) {
        // Here we are incorrectly using the isInstance method with a Class object instead of an instance
        boolean conditionWhile = getCondition(); // Non-final variable to avoid unreachable statement error
        while (conditionWhile) {
            // Unreachable code, since conditionWhile is always false
            System.out.println("This is an unreachable while loop.");
        }
        return lhs.isInstance(rhs); // BUG: IsInstanceOfClass
    }

    // Method to return a boolean condition, always false for this example
    private boolean getCondition() {
        return false; // Ensures the while loop is unreachable
    }

    public static void main(String[] args) {
        InstanceOfClassBug bugDemo = new InstanceOfClassBug();
        boolean result = bugDemo.showBug(String.class, Integer.class);
        System.out.println("The result of the buggy method is: " + result);
    }
}