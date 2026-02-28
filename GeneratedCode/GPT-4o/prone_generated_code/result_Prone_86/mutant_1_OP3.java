class InstanceOfClassBug {

    public <A, B> boolean showBug(Class<A> lhs, Class<B> rhs) {
        // Here we are incorrectly using the isInstance method with a Class object instead of an instance
        boolean result = lhs.isInstance(rhs); // BUG: IsInstanceOfClass
        
        // Inserting unreachable if branch
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This block is unreachable and should not be executed.");
        }
        
        return result;
    }

    private boolean getUnreachableCondition() {
        return false; // The method always returns false, making the if statement unreachable
    }

    public static void main(String[] args) {
        InstanceOfClassBug bugDemo = new InstanceOfClassBug();
        boolean result = bugDemo.showBug(String.class, Integer.class);
        System.out.println("The result of the buggy method is: " + result);
    }
}