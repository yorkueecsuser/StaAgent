class UnnecessaryCaseChangeBug {
    public boolean showBug(String buz) {
        boolean answer1 = buz.toUpperCase().equals("BAZ");

        // Mutation: Add unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable loop");
        }

        return answer1;
    }

    public boolean showAnotherBug(String buz) {
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ");

        // Mutation: Add unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable loop");
        }

        return answer2;
    }

    // Method to dynamically determine the loop condition
    private boolean getCondition() {
        return false;  // Always returns false making the loop unreachable
    }
}