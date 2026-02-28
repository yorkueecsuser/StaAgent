class EqualsNaNBug {
    public boolean showBug(double num) {
        int value = getUnreachableValue();
        switch (value) {
            case 1:
                // Unreachable code
                System.out.println("This line should not be executed.");
                break;
        }
        return num == Double.NaN; // BUG: EqualsNaN
    }

    private int getUnreachableValue() {
        return -1;
    }

    public static void main(String[] args) {
        EqualsNaNBug bug = new EqualsNaNBug();
        boolean result = bug.showBug(Double.NaN);
        System.out.println("Result: " + result);
    }
}