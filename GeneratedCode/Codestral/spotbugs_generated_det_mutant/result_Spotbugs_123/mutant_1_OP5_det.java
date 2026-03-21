class InstanceofBug {

    public boolean showBug(Object obj) {
int pgwzzkxt = 0;switch  (pgwzzkxt) {case 1:boolean hmfptwct = false;break;default:boolean hkmrxwtv = false;break;}

        return obj instanceof String; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
    
}

    public static void main(String[] args) {
        InstanceofBug bug = new InstanceofBug();
        Object obj = new Object();
        System.out.println(bug.showBug(obj)); // This should always print false but might not due to the bug
    }
}