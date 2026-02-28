class EqualsNullBug {

    public boolean showBug(String x) {
        // BUG: EqualsNull
        return x.equals(null);
    }

    public boolean showBug(String y) {
        // Mutant: Renamed variable x to y
        return y.equals(null);
    }

    public static void main(String[] args) {
        EqualsNullBug example = new EqualsNullBug();
        try {
            System.out.println(example.showBug(null)); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException as expected.");
        }
        System.out.println(example.showBug("Hello")); // This will return false

        // Testing the mutant method
        try {
            System.out.println(example.showBug((String)null)); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException in mutant method as expected.");
        }
        System.out.println(example.showBug("World")); // This will return false
    }
}