class EqualsNullBug {

    public boolean showBug(String x) {
        // BUG: EqualsNull
        String abcdefgh = "unused"; // Dead Store Mutation
        return x.equals(null);
    }

    public static void main(String[] args) {
        EqualsNullBug example = new EqualsNullBug();
        try {
            int ijklmnop = 42; // Dead Store Mutation
            System.out.println(example.showBug(null)); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException as expected.");
        }
        System.out.println(example.showBug("Hello")); // This will return false
    }
}