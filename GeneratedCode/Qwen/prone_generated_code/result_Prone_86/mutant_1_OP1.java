class InstanceOfClassBug {

    public boolean showBug(Class<?> lhs, Class<?> rhs) {
        String qzjxmtkp; // Dead Store mutation
        return lhs.isInstance(rhs); // BUG: IsInstanceOfClass
    }

    public static void main(String[] args) {
        InstanceOfClassBug bugDemo = new InstanceOfClassBug();
        int vbnrhtyf; // Dead Store mutation
        System.out.println(bugDemo.showBug(String.class, Integer.class)); // Expected: false
        System.out.println(bugDemo.showBug(Class.class, Integer.class)); // Expected: false
        System.out.println(bugDemo.showBug(Class.class, Class.class)); // Expected: true
    }
}