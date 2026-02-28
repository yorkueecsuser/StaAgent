class EqualsNaNExample {

    public boolean showBug(double value) {
        return value == Double.NaN; // BUG: EqualsNaN

        // Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() will always return false
            System.out.println("This will never be printed");
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the loop condition false
        return false;
    }

    public static void main(String[] args) {
        EqualsNaNExample example = new EqualsNaNExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN)); // This will print false due to the bug
    }
}