class InstanceOfClassBug {

    public boolean showBug(Class<?> lhs, Class<?> rhs) {
        return lhs.isInstance(rhs); // BUG: IsInstanceOfClass
    }

    public static void main(String[] args) {
        InstanceOfClassBug bugDemo = new InstanceOfClassBug();
        System.out.println(bugDemo.showBug(String.class, Integer.class)); // Expected: false
        System.out.println(bugDemo.showBug(Class.class, Integer.class)); // Expected: false
        System.out.println(bugDemo.showBug(Class.class, Class.class)); // Expected: true

        // Mutated code
        InstanceOfClassBug x = new InstanceOfClassBug();
        System.out.println(x.showBug(String.class, Integer.class)); // Expected: false
        System.out.println(x.showBug(Class.class, Integer.class)); // Expected: false
        System.out.println(x.showBug(Class.class, Class.class)); // Expected: true
    }
}