class EqualsNaNExample {

    public boolean showBug(double value) {
        // Introduced an unreachable while loop according to the mutation operator
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() always returns false
        }
        
        return value == Double.NaN; // BUG: EqualsNaN
    }

    private boolean getCondition() {
        // This method always returns false, ensuring the while loop is unreachable
        return false;
    }

    public static void main(String[] args) {
        EqualsNaNExample example = new EqualsNaNExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN)); // This will print false due to the bug
    }
}