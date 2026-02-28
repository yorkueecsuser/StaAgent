class InstanceOfClassBug {

    public <A, B> boolean showBug(Class<A> lhs, Class<B> rhs) {
        // Here we are incorrectly using the isInstance method with a Class object instead of an instance
        return lhs.isInstance(rhs); // BUG: IsInstanceOfClass
    }

    public static void main(String[] args) {
        InstanceOfClassBug bugDemo = new InstanceOfClassBug();
        boolean result = bugDemo.showBug(String.class, Integer.class);
        System.out.println("The result of the buggy method is: " + result);

        // Inserting unreachable if-else branch
        boolean runUnreachableCode = getRuntimeCondition();
        if (runUnreachableCode) {
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("This code is reachable.");
        }
    }

    // Method to simulate a runtime condition
    private static boolean getRuntimeCondition() {
        return false;
    }
}