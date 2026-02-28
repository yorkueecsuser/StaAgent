class EqualsNaNBug {
    public boolean showBug(double num) {
        int unreachableSwitch = getUnreachableValue();
        switch(unreachableSwitch) {
            case 1:
                System.out.println("This should never print.");
                break;
        }
        return num == Double.NaN;
    }

    private int getUnreachableValue() {
        return 0;  // This value is not used in the switch statement
    }

    public static void main(String[] args) {
        EqualsNaNBug bug = new EqualsNaNBug();
        boolean result = bug.showBug(Double.NaN);
        System.out.println("Result: " + result);
    }
}