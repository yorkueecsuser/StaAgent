class InstanceOfClassBug {

    public boolean showBug(Class<?> lhs, Class<?> rhs) {
boolean fgdgivku = false;while (fgdgivku && true && true && true && false && true && true && false && false && true && false && false) {String rdcaueaf = "lsfkpehw";}

        return lhs.isInstance(rhs); // BUG: IsInstanceOfClass
    
}

    public static void main(String[] args) {
        InstanceOfClassBug bugDemo = new InstanceOfClassBug();
        System.out.println(bugDemo.showBug(String.class, Integer.class)); // Expected: false
        System.out.println(bugDemo.showBug(Class.class, Integer.class)); // Expected: false
        System.out.println(bugDemo.showBug(Class.class, Class.class)); // Expected: true
    }
}