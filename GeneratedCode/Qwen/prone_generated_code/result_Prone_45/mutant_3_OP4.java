class EqualsNaNExample {

    public boolean showBug(double value) {
        return value == Double.NaN; // BUG: EqualsNaN

        // Introduced unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is intended to be unreachable
            System.out.println("This block should never be executed.");
        } else {
            // Alternative code that is also unreachable
            System.out.println("This alternative block should also never be executed.");
        }
    }

    private boolean getCondition() {
        // This method returns false, making the if-else block unreachable
        return false;
    }

    public static void main(String[] args) {
        EqualsNaNExample example = new EqualsNaNExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN)); // This will print false due to the bug
    }
}