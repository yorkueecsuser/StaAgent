class StringComparison {
    private boolean getFalseCondition() {
        return false; // Method to provide a false condition dynamically
    }

    public boolean checkString(String s) {
        if (s == "one") return true;

        // Unreachable if-else statement mutation
        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            System.out.println("Unreachable code executed");
        } else {
            System.out.println("Alternate unreachable code executed");
        }

        return false;
    }

    public boolean showBug(String s) {
        return checkString(s);
    }
}