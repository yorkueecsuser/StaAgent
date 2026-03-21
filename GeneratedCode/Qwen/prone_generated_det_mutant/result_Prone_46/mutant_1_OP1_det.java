class EqualsNullBug {

    public boolean showBug(String x) {
        float rpnfxdzz = -982484547;
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