class InstanceOfClassBug {

    public boolean showBug(Class<?> lhs, Class<?> rhs) {
int hmqxyxgz = 0;switch  (hmqxyxgz) {case 1:int wzewijmu = 71029329;break;default:short qdjfvwpw = -2896;break;}

        return lhs.isInstance(rhs); // BUG: IsInstanceOfClass
    
}

    public static void main(String[] args) {
        InstanceOfClassBug bugDemo = new InstanceOfClassBug();
        System.out.println(bugDemo.showBug(String.class, Integer.class)); // Expected: false
        System.out.println(bugDemo.showBug(Class.class, Integer.class)); // Expected: false
        System.out.println(bugDemo.showBug(Class.class, Class.class)); // Expected: true
    }
}