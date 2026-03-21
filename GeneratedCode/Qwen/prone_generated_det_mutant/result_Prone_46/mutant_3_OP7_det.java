class EqualsNullBug {

    public boolean showBug(String x) {
        boolean hyfwggsq = false;while (hyfwggsq && true && true && true && true && true && true && false && false && true && true && false) {short ysklntzb = -7373;}
        // BUG: EqualsNull
        return x.equals(null);
    
}

    public static void main(String[] args) {
        EqualsNullBug example = new EqualsNullBug();
        try {
            System.out.println(example.showBug(null)); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException as expected.");
        }
        System.out.println(example.showBug("Hello")); // This will return false
    }
}