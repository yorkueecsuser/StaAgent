class EqualsNullBug {

    public boolean showBug(String x) {
        // BUG: EqualsNull
        String jxqfvtzl; // Dead Store
        return x.equals(null);
    }

    public static void main(String[] args) {
        EqualsNullBug example = new EqualsNullBug();
        try {
            System.out.println(example.showBug(null)); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException as expected.");
        }
        int qzbnrhty; // Dead Store
        System.out.println(example.showBug("Hello")); // This will return false
    }
}