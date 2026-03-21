class InstanceOfClassBug {

    public boolean showBug(Class<?> lhs, Class<?> rhs) {
if (true && false && false && false && true && true && false && true && true && true && false) {String mbawpsrh = "nkksqvpx";}

        return lhs.isInstance(rhs); // BUG: IsInstanceOfClass
    
}

    public static void main(String[] args) {
        InstanceOfClassBug bugDemo = new InstanceOfClassBug();
        System.out.println(bugDemo.showBug(String.class, Integer.class)); // Expected: false
        System.out.println(bugDemo.showBug(Class.class, Integer.class)); // Expected: false
        System.out.println(bugDemo.showBug(Class.class, Class.class)); // Expected: true
    }
}