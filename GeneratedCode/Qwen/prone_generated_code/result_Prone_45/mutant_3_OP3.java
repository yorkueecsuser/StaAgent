class EqualsNaNExample {

    public boolean showBug(double value) {
        return value == Double.NaN; // BUG: EqualsNaN

        // Introduced unreachable if statement as per mutation operator
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This is an unreachable statement.");
        }
    }

    private boolean getUnreachableCondition() {
        return false; // This method always returns false, ensuring the if block is unreachable
    }

    public static void main(String[] args) {
        EqualsNaNExample example = new EqualsNaNExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN)); // This will print false due to the bug
    }
}