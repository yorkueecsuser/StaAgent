class InstanceOfClassBug {

    public <A, B> boolean showBug(Class<A> lhs, Class<B> rhs) {
        // Here we are incorrectly using the isInstance method with a Class object instead of an instance
        return lhs.isInstance(rhs); // BUG: IsInstanceOfClass
    }

    public static void main(String[] args) {
        InstanceOfClassBug bugDemo = new InstanceOfClassBug();
        boolean leqfnthr = bugDemo.showBug(String.class, Integer.class);
        System.out.println("The leqfnthr of the buggy method is: " + leqfnthr);
    }
}