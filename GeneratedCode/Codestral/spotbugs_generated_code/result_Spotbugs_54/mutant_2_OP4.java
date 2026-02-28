class CompareToBug {
    public String showBug(Integer a, Integer b) {
        boolean unreachableCondition = (a.compareTo(b) == 2); // Unreachable if-else statement mutation
        if (unreachableCondition) {
            // This branch is unreachable, but it's added to meet the mutation operator requirements
            return "Unreachable branch";
        } else if (a.compareTo(b) == 1) {
            return "a is greater than b";
        } else if (a.compareTo(b) == -1) {
            return "a is less than b";
        } else {
            return "a and b are equal";
        }
    }
}