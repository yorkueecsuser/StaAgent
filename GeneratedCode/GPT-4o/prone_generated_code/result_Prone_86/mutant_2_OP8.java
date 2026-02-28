class InstanceOfClassBug {

    public <A, B> boolean showBug(Class<A> lhs, Class<B> rhs) {
        // Here we are incorrectly using the isInstance method with a Class object instead of an instance
        return lhs.isInstance(rhs); // BUG: IsInstanceOfClass
    }

    // Mutated method with a renamed variable
    public <x, y> boolean showBugMutant(Class<x> lhs, Class<y> rhs) {
        // Here we are incorrectly using the isInstance method with a Class object instead of an instance
        return lhs.isInstance(rhs); // BUG: IsInstanceOfClass
    }

    public static void main(String[] args) {
        InstanceOfClassBug bugDemo = new InstanceOfClassBug();
        boolean result = bugDemo.showBug(String.class, Integer.class);
        System.out.println("The result of the buggy method is: " + result);

        // Test the mutated method
        boolean mutantResult = bugDemo.showBugMutant(String.class, Integer.class);
        System.out.println("The result of the mutated method is: " + mutantResult);
    }
}