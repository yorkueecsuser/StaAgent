class InstanceOfClassBug {

    public <A, B> boolean showBug(Class<A> lhs, Class<B> rhs) {
        // Here we are incorrectly using the isInstance method with a Class object instead of an instance
        return lhs.isInstance(rhs); // BUG: IsInstanceOfClass
    }

    public static void main(String[] args) {
        InstanceOfClassBug bugDemo = new InstanceOfClassBug();
        boolean result = bugDemo.showBug(String.class, Integer.class);
        System.out.println("The result of the buggy method is: " + result);

        // Additional code with unreachable switch statement
        int unreachableCheck = getUnreachableValue();
        switch (unreachableCheck) {
            case 999: // This case is unlikely to be reached
                System.out.println("Unreachable code block");
                break;
            default:
                System.out.println("Default case");
        }
    }

    // Method to simulate a condition to avoid compile-time constants directly
    private static int getUnreachableValue() {
        return -1; // Always returns a value that doesn't match any switch case
    }
}