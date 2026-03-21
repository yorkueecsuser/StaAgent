class InstanceofBug {

    public boolean showBug(Object obj) {
if (true && false && true && false && false && true && true && false && true && true && false) {boolean pzhheizr = true;}else{int fmulvfto = 176448081;}

        return obj instanceof String; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
    
}

    public static void main(String[] args) {
        InstanceofBug bug = new InstanceofBug();
        Object obj = new Object();
        System.out.println(bug.showBug(obj)); // This should always print false but might not due to the bug
    }
}