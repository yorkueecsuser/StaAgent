class CompareToBug {
    private boolean unreachableCondition() {
        return false; // Always return false to ensure unreachability
    }

    public String showBug(Integer a, Integer b) {
        if (a.compareTo(b) == 1) { // Original bug
            return "a is greater than b";
        } else if (a.compareTo(b) == -1) {
            return "a is less than b";
        } else {
            return "a and b are equal";
        }

        // Mutant: Unreachable if statement
        if (unreachableCondition()) {
            System.out.println("This line is unreachable");
        }
    }
}