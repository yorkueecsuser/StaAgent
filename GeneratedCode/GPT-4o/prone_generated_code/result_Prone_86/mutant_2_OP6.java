class InstanceOfClassBug {

    public <A, B> boolean showBug(Class<A> lhs, Class<B> rhs) {
        // Here we are incorrectly using the isInstance method with a Class object instead of an instance
        return lhs.isInstance(rhs); // BUG: IsInstanceOfClass
    }

    public static void main(String[] args) {
        InstanceOfClassBug bugDemo = new InstanceOfClassBug();
        boolean result = bugDemo.showBug(String.class, Integer.class);
        System.out.println("The result of the buggy method is: " + result);

        // Inserting unreachable for loop
        boolean unreachableLoopCondition = getUnreachableCondition();
        for (int i = 0; unreachableLoopCondition; i++) {
            System.out.println("This loop is unreachable");
        }
    }

    // Method to simulate a condition for the unreachable for loop
    private static boolean getUnreachableCondition() {
        return false;
    }
}