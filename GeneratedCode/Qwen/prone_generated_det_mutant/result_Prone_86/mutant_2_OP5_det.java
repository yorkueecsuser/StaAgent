class InstanceOfClassBug {

    public boolean showBug(Class<?> lhs, Class<?> rhs) {
int nrdmlpwc = 0;switch  (nrdmlpwc) {case 1:byte elrgwfab = 77;break;default:int rffbouqr = -20638760;break;}

        return lhs.isInstance(rhs); // BUG: IsInstanceOfClass
    
}

    public static void main(String[] args) {
        InstanceOfClassBug bugDemo = new InstanceOfClassBug();
        System.out.println(bugDemo.showBug(String.class, Integer.class)); // Expected: false
        System.out.println(bugDemo.showBug(Class.class, Integer.class)); // Expected: false
        System.out.println(bugDemo.showBug(Class.class, Class.class)); // Expected: true
    }
}