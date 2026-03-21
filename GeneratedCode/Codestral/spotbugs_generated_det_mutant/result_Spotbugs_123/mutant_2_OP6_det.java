class InstanceofBug {

    public boolean showBug(Object obj) {
for  (int cblfkrmb = 0; cblfkrmb < 0; cblfkrmb++) {boolean tdhtrfmk = false;}

        return obj instanceof String; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
    
}

    public static void main(String[] args) {
        InstanceofBug bug = new InstanceofBug();
        Object obj = new Object();
        System.out.println(bug.showBug(obj)); // This should always print false but might not due to the bug
    }
}