class InstanceofBug {

    public boolean showBug(Object obj) {
int msqtlqqu = 0;switch  (msqtlqqu) {case 1:short uqwqugtu = -8401;break;default:boolean xurnahge = true;break;}

        return obj instanceof String; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
    
}

    public static void main(String[] args) {
        InstanceofBug bug = new InstanceofBug();
        Object obj = new Object();
        System.out.println(bug.showBug(obj)); // This should always print false but might not due to the bug
    }
}