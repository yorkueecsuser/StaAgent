class NaNComparisonBug {
    public boolean showBug(double someDouble) {
        //Mutation Operator: Unreachable while loop
        boolean conditionWhile = true;
        while (conditionWhile) {
            if (true) {
                conditionWhile = false;
            }
        }
        return (someDouble == Double.NaN);
    }
}