class EqualsNaN {
    public static void main(String[] args) {
        double x = Double.NaN;
        if (x == Double.NaN) { // BUG: EqualsNaN
            System.out.println("x is NaN");
        } else {
            System.out.println("x is not NaN");
        }

        // Mutation Operator: Unreachable switch statement
        int value = getValue();
        switch (value) {
            case 1:
                // code
                break;
            default:
                // alternative code
                break;
        }
    }

    private static int getValue() {
        return 0;
    }
}