class InstanceOfClassBug {

    public boolean showBug(Class<?> lhs, Class<?> rhs) {
        return lhs.isInstance(rhs); // BUG: IsInstanceOfClass

        // Inserting an unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            // This block will never be executed because getCondition() always returns false
            System.out.println("This is an unreachable if block.");
        } else {
            // This block will also never be executed for the same reason
            System.out.println("This is an unreachable else block.");
        }
    }

    private boolean getCondition() {
        // Always returns false to ensure the if-else branch is unreachable
        return false;
    }

    public static void main(String[] args) {
        InstanceOfClassBug bugDemo = new InstanceOfClassBug();
        System.out.println(bugDemo.showBug(String.class, Integer.class)); // Expected: false
        System.out.println(bugDemo.showBug(Class.class, Integer.class)); // Expected: false
        System.out.println(bugDemo.showBug(Class.class, Class.class)); // Expected: true
    }
}