class InstanceOfClassBug {

    public <A, B> boolean showBug(Class<A> lhs, Class<B> rhs) {
        // Dead store mutation: Inserting an unused variable declaration
        int abcdefgh = 42; // Unused variable added as dead store
        // Here we are incorrectly using the isInstance method with a Class object instead of an instance
        return lhs.isInstance(rhs); // BUG: IsInstanceOfClass
    }

    public static void main(String[] args) {
        InstanceOfClassBug bugDemo = new InstanceOfClassBug();
        boolean result = bugDemo.showBug(String.class, Integer.class);
        System.out.println("The result of the buggy method is: " + result);
    }
}