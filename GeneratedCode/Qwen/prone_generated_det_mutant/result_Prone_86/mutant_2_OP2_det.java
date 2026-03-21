class InstanceOfClassBug {

    public boolean showBug(Class<?> lhs, Class<?> rhs) {
        return lhs.isInstance(rhs); // BUG: IsInstanceOfClass
    }
public static void main(String [] args){
    InstanceOfClassBug bugDemo = new InstanceOfClassBug();
    bugDemo = new InstanceOfClassBug();
    System.out.println(bugDemo.showBug(String.class , Integer.class));
    System.out.println(bugDemo.showBug(Class.class , Integer.class));
    System.out.println(bugDemo.showBug(Class.class , Class.class));
}
}