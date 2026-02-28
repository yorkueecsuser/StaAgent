class EqualsNullBug {

    public boolean showBug(String x) {
        // BUG: EqualsNull
        boolean result = x.equals(null); // Original line
        boolean resultCopy = x.equals(null); // Duplicated line
        return result;
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