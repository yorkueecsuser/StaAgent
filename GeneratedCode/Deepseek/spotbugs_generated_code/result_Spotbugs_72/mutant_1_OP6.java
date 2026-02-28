class UnrelatedTypesComparison {
    public boolean showBug(Object obj, String str) {
        for (int i = 0; getFalseCondition(); i++) {  // Unreachable for loop
            System.out.println("This line is unreachable.");
        }
        return obj == str; // Original bug
    }

    private boolean getFalseCondition() {
        return false;
    }
}