class InstanceOfClassBug {

    public boolean showBug(Class<?> lhs, Class<?> rhs) {
        boolean result = lhs.isInstance(rhs); // Original line
        boolean resultCopy = result; // Duplicated assignment of the result
        return result;
    }

    public static void main(String[] args) {
        InstanceOfClassBug bugDemo = new InstanceOfClassBug();
        System.out.println(bugDemo.showBug(String.class, Integer.class)); // Expected: false
        System.out.println(bugDemo.showBug(Class.class, Integer.class)); // Expected: false
        System.out.println(bugDemo.showBug(Class.class, Class.class)); // Expected: true
    }
}