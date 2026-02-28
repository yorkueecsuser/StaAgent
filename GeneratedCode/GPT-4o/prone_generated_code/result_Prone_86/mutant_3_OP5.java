class InstanceOfClassBug {

    public <A, B> boolean showBug(Class<A> lhs, Class<B> rhs) {
        // Here we are incorrectly using the isInstance method with a Class object instead of an instance
        return lhs.isInstance(rhs); // BUG: IsInstanceOfClass
    }

    public static void main(String[] args) {
        InstanceOfClassBug bugDemo = new InstanceOfClassBug();
        boolean result = bugDemo.showBug(String.class, Integer.class);
        System.out.println("The result of the buggy method is: " + result);

        // Inserting unreachable switch statement
        int unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition) {
            case 1:
                System.out.println("This case is unreachable.");
                break;
            default:
                // This is the default case which is also unreachable
                break;
        }
    }

    // Method to obtain a condition for the unreachable switch statement
    private static int getUnreachableCondition() {
        return -1; // Always returns -1, which doesn't match any case in the switch
    }
}