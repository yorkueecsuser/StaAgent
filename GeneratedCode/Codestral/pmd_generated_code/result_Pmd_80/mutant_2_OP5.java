class UnnecessaryCaseChangeBug {
    private boolean getFalseCondition() {
        // This method always returns false to ensure the switch statement is unreachable
        return false;
    }

    public boolean showBug(String buz) {
        // Original code
        boolean answer1 = buz.toUpperCase().equals("BAZ");

        // Mutation: Unreachable switch statement
        int condition = getFalseCondition()? 1 : 0; // Always evaluates to 0
        switch(condition) {
            case 1:
                System.out.println("This line is unreachable.");
                break;
        }

        return answer1;
    }

    public boolean showAnotherBug(String buz) {
        // Original code
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ");

        // Mutation: Unreachable switch statement
        int condition = getFalseCondition()? 1 : 0; // Always evaluates to 0
        switch(condition) {
            case 1:
                System.out.println("This line is unreachable.");
                break;
        }

        return answer2;
    }
}