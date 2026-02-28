class UnnecessaryTypeCheck {
    public Object showBug(Object obj) {
        if (obj instanceof String) {
            boolean conditionFor = getConditionForLoop(); // Method call to determine loop condition
            for (int i = 0; conditionFor; i++) { // Unreachable for loop
                System.out.println("This loop should never execute");
            }
            return ((String) obj).toUpperCase();
        }
        throw new IllegalArgumentException("Object is not a String");
    }

    private boolean getConditionForLoop() {
        return false; // Always return false to make the loop unreachable
    }
}