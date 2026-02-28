class InstanceOfClassBug {

    public <A, B> boolean showBug(Class<A> lhs, Class<B> rhs) {
        // Here we are incorrectly using the isInstance method with a Class object instead of an instance
        return lhs.isInstance(rhs); // BUG: IsInstanceOfClass
    }

    public static void main(String[] args) {
        InstanceOfClassBug bugDemo = new InstanceOfClassBug();
        boolean result = bugDemo.showBug(String.class, Integer.class);
        System.out.println("The result of the buggy method is: " + result);
        
        // Inserting unreachable if statement
        boolean neverTrue = getFalseCondition();
        if (neverTrue) {
            System.out.println("This block is never reached.");
        }
    }
    
    // Method to provide a false condition
    public static boolean getFalseCondition() {
        return false;
    }
}