class InstanceOfClassBug {

    public boolean showBug(Class<?> lhs, Class<?> rhs) {
int rfavaevy = 0;switch  (rfavaevy) {case 1:String wkoaexwt = "kmhaisxa";break;default:int fghqdyxp = -617751809;break;}

        return lhs.isInstance(rhs); // BUG: IsInstanceOfClass
    
}

    public static void main(String[] args) {
        InstanceOfClassBug bugDemo = new InstanceOfClassBug();
        System.out.println(bugDemo.showBug(String.class, Integer.class)); // Expected: false
        System.out.println(bugDemo.showBug(Class.class, Integer.class)); // Expected: false
        System.out.println(bugDemo.showBug(Class.class, Class.class)); // Expected: true
    }
}