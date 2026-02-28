class InstanceOfClassBug {

    public <A, B> boolean showBug(Class<A> lhs, Class<B> rhs) {
        // Here we are incorrectly using the isInstance method with a Class object instead of an instance
        return lhs.isInstance(rhs); // BUG: IsInstanceOfClass
    }

    // Mutant Code: Renaming a variable 'lhs' to 'x'
    public <A, B> boolean showBugMutant(Class<A> x, Class<B> rhs) {
        // Here we are incorrectly using the isInstance method with a Class object instead of an instance
        return x.isInstance(rhs); // BUG: IsInstanceOfClass
    }

    public static void main(String[] args) {
        InstanceOfClassBug bugDemo = new InstanceOfClassBug();
        boolean result = bugDemo.showBug(String.class, Integer.class);
        System.out.println("The result of the buggy method is: " + result);
        
        // Result from the mutant method
        boolean mutantResult = bugDemo.showBugMutant(String.class, Integer.class);
        System.out.println("The result of the buggy mutant method is: " + mutantResult);
    }
}