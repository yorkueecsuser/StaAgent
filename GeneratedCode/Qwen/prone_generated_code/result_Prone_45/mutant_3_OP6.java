class EqualsNaNExample {

    public boolean showBug(double value) {
        return value == Double.NaN; // BUG: EqualsNaN

        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable code
            System.out.println("This loop is unreachable");
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but returns false
    }

    public static void main(String[] args) {
        EqualsNaNExample example = new EqualsNaNExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN)); // This will print false due to the bug
    }
}