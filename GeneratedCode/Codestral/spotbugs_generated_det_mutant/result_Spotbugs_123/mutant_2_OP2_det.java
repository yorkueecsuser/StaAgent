class InstanceofBug {

    public boolean showBug(Object obj) {
        return obj instanceof String; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
    }
public static void main(String [] args){
    InstanceofBug bug = new InstanceofBug();
    bug = new InstanceofBug();
    Object obj = new Object();
    System.out.println(bug.showBug(obj));
}
}