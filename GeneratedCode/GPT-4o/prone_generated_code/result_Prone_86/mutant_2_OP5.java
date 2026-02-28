class InstanceOfClassBug {

    public <A, B> boolean showBug(Class<A> lhs, Class<B> rhs) {
        // Here we are incorrectly using the isInstance method with a Class object instead of an instance
        return lhs.isInstance(rhs); // BUG: IsInstanceOfClass
    }

    public static void main(String[] args) {
        InstanceOfClassBug bugDemo = new InstanceOfClassBug();
        boolean result = bugDemo.showBug(String.class, Integer.class);
        System.out.println("The result of the buggy method is: " + result);

        // Adding an unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1: 
                System.out.println("This is case 1");
                break;
            case 2: 
                System.out.println("This is case 2");
                break;
            default:
                // This default case is actually reachable
                System.out.println("Default case");
                break;
        }
    }

    private static int getUnreachableValue() {
        // This method will always return a value that does not match any case
        return 0;
    }
}