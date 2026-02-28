class InstanceOfClassBug {

    public <A, B> boolean showBug(Class<A> lhs, Class<B> rhs) {
        // Here we are incorrectly using the isInstance method with a Class object instead of an instance
        return lhs.isInstance(rhs); // BUG: IsInstanceOfClass
    }

    public static void main(String[] args) {
        InstanceOfClassBug bugDemo = new InstanceOfClassBug();
        boolean result = bugDemo.showBug(String.class, Integer.class);
        System.out.println("The result of the buggy method is: " + result);

        // Adding a unique unreachable if-else branch
        boolean condition = getCondition(); // This method will determine the condition at runtime
        if (condition) {
            System.out.println("This branch will never execute.");
        } else {
            System.out.println("This branch is always executed.");
        }
    }

    // Method to simulate a condition that's always false at runtime
    private static boolean getCondition() {
        // Returns false to make the 'if' branch unreachable
        return false;
    }
}