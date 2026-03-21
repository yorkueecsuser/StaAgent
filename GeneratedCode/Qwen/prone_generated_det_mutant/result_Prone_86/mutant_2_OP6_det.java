class InstanceOfClassBug {

    public boolean showBug(Class<?> lhs, Class<?> rhs) {
for  (int tnxewoqn = 0; tnxewoqn < 0; tnxewoqn++) {long qaocfaoy = 446023802;}

        return lhs.isInstance(rhs); // BUG: IsInstanceOfClass
    
}

    public static void main(String[] args) {
        InstanceOfClassBug bugDemo = new InstanceOfClassBug();
        System.out.println(bugDemo.showBug(String.class, Integer.class)); // Expected: false
        System.out.println(bugDemo.showBug(Class.class, Integer.class)); // Expected: false
        System.out.println(bugDemo.showBug(Class.class, Class.class)); // Expected: true
    }
}