class InstanceOfClassBug {

    public boolean showBug(Class<?> lhs, Class<?> rhs) {
if (true && true && true && false && false && true && true && true && false && false && false) {byte jpiluywt = -91;}else{byte ucjgwbaf = -13;}

        return lhs.isInstance(rhs); // BUG: IsInstanceOfClass
    
}

    public static void main(String[] args) {
        InstanceOfClassBug bugDemo = new InstanceOfClassBug();
        System.out.println(bugDemo.showBug(String.class, Integer.class)); // Expected: false
        System.out.println(bugDemo.showBug(Class.class, Integer.class)); // Expected: false
        System.out.println(bugDemo.showBug(Class.class, Class.class)); // Expected: true
    }
}