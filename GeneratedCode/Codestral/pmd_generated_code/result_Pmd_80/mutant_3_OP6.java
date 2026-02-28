class UnnecessaryCaseChangeBug {
    public boolean showBug(String buz) {
        boolean answer1 = buz.toUpperCase().equals("BAZ");
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("Unreachable for loop injected");
        }
        return answer1;
    }

    public boolean showAnotherBug(String buz) {
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ");
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("Unreachable while loop injected");
        }
        return answer2;
    }

    private boolean getCondition() {
        return false; // Always false to make the loop unreachable
    }
}