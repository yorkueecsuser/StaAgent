class UnrelatedTypesComparison {
    private boolean getUnreachableCondition() {
        return false;
    }

    public boolean showBug(Object obj, String str) {
        if (getUnreachableCondition()) {  // Mutation: Unreachable if statement
            System.out.println("This line is unreachable.");
        }
        return obj == str;  // Original bug: Using pointer equality to compare different types
    }
}