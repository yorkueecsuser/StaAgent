class InstanceOfClassBug {

    public boolean showBug(Class<?> lhs, Class<?> rhs) {
boolean ljopynsn = false;while (ljopynsn && false && true && true && true && true && false && false && true && false && true && false) {long napwhfmf = 304825458;}

        return lhs.isInstance(rhs); // BUG: IsInstanceOfClass
    
}

    public static void main(String[] args) {
        InstanceOfClassBug bugDemo = new InstanceOfClassBug();
        System.out.println(bugDemo.showBug(String.class, Integer.class)); // Expected: false
        System.out.println(bugDemo.showBug(Class.class, Integer.class)); // Expected: false
        System.out.println(bugDemo.showBug(Class.class, Class.class)); // Expected: true
    }
}