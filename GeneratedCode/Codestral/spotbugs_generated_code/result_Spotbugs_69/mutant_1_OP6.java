class RedundantNullCheckBug {
    public String showBug(String str) {
        StringBuilder sb = new StringBuilder(str);
        boolean conditionFor = getCondition();  // Always false condition
        for (int i = 0; conditionFor; i++) {
            // Unreachable code
            System.out.println("This line will never be executed.");
        }
        if (sb!= null) {
            return sb.toString();
        }
        return null;
    }

    private boolean getCondition() {
        return false;  // Always return false
    }
}