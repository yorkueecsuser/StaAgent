class EqualsNaNBug {
    private int getUnreachableValue() {
        return 1;
    }

    public boolean showBug(double num) {
        int value = getUnreachableValue(); // Added method to dynamically determine switch value
        switch (value) { // Added unreachable switch statement
            case 1:
                System.out.println("This case should never be reached");
                break;
        }
        return num == Double.NaN; // BUG: EqualsNaN
    }

    public static void main(String[] args) {
        EqualsNaNBug bug = new EqualsNaNBug();
        boolean result = bug.showBug(Double.NaN);
        System.out.println("Result: " + result);
    }
}