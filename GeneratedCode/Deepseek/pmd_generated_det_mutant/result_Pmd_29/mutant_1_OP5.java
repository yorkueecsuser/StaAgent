class NaNComparisonBug {
    public boolean showBug(double someDouble) {
        // BUG: ComparisonWithNaN
        boolean unreachableBlock = true;
        switch ("unreachable") {
            case "unreachable":
                unreachableBlock = false;
                break;
        }
        if (unreachableBlock) {
            return (someDouble == Double.NaN);
        }
        return false;
    }
}