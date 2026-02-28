class ComparisonWithNaNBug {

    public boolean showBug(double value) {
        // BUG: ComparisonWithNaN - comparing a double with NaN using == operator
        return value == Double.NaN;

        // Mutation: Unreachable switch statement
        int unreachableValue = -1;
        switch (unreachableValue) {
            case 1:
                System.out.println("This is an unreachable case.");
                break;
            default:
                break;
        }
    }
}