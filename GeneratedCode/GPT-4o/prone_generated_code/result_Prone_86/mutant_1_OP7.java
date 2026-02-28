class InstanceOfClassBug {

    public <A, B> boolean showBug(Class<A> lhs, Class<B> rhs) {
        // Here we are incorrectly using the isInstance method with a Class object instead of an instance
        boolean conditionWhile = getCondition(); // Ensure condition is dynamically evaluated
        while (conditionWhile) {
            // This block is unreachable, but the condition is not a compile-time constant
            System.out.println("This is an unreachable while loop.");
        }
        return lhs.isInstance(rhs); // BUG: IsInstanceOfClass
    }

    private boolean getCondition() {
        // This method will always return false, but it's not a compile-time constant
        return false;
    }

    public static void main(String[] args) {
        InstanceOfClassBug bugDemo = new InstanceOfClassBug();
        boolean result = bugDemo.showBug(String.class, Integer.class);
        System.out.println("The result of the buggy method is: " + result);
    }
}