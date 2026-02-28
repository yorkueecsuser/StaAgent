class EqualsNullBug {

    public boolean showBug(String x) {
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

        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is always false
        }
    }

    private static boolean getCondition() {
        return false;
    }
}