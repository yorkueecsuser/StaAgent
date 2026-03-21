class InstanceOfClassBug {

    public boolean showBug(Class<?> lhs, Class<?> rhs) {
for  (int hojliaht = 0; hojliaht < 0; hojliaht++) {float lgkpvcke = 912439744;}

        return lhs.isInstance(rhs); // BUG: IsInstanceOfClass
    
}

    public static void main(String[] args) {
        InstanceOfClassBug bugDemo = new InstanceOfClassBug();
        System.out.println(bugDemo.showBug(String.class, Integer.class)); // Expected: false
        System.out.println(bugDemo.showBug(Class.class, Integer.class)); // Expected: false
        System.out.println(bugDemo.showBug(Class.class, Class.class)); // Expected: true
    }
}