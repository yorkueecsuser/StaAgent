class InstanceofBug {

    public boolean showBug(Object obj) {
int syjsjyrq = 0;switch  (syjsjyrq) {case 1:boolean isinycrw = true;break;default:String usehvkme = "tnalqnqg";break;}

        return obj instanceof String; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
    
}

    public static void main(String[] args) {
        InstanceofBug bug = new InstanceofBug();
        Object obj = new Object();
        System.out.println(bug.showBug(obj)); // This should always print false but might not due to the bug
    }
}