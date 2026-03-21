class InstanceOfClassBug {

    public boolean showBug(Class<?> lhs, Class<?> rhs) {
if (false && true && false && true && false && true && false && true && true && true && false) {boolean icqkydof = true;}else{long nmncqkmq = 621182300;}

        return lhs.isInstance(rhs); // BUG: IsInstanceOfClass
    
}

    public static void main(String[] args) {
        InstanceOfClassBug bugDemo = new InstanceOfClassBug();
        System.out.println(bugDemo.showBug(String.class, Integer.class)); // Expected: false
        System.out.println(bugDemo.showBug(Class.class, Integer.class)); // Expected: false
        System.out.println(bugDemo.showBug(Class.class, Class.class)); // Expected: true
    }
}