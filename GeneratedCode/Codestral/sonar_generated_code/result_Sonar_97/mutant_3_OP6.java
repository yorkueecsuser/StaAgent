class AbsBug {
    private boolean getCondition() {
        return false;  // Always returns false to make the loop unreachable
    }

    public int showBug(String str) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {  // Unreachable for loop
            System.out.println("This line should not be executed");
        }
        return Math.abs(str.hashCode());  // Original code
    }
}