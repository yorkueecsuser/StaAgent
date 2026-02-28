class FormatStringBugExample {

    public String showBug() {
        double value = Math.E;
        // Attempting to format a double with an unknown conversion specifier 'r'
        String result = String.format("Formatted value: %r", value); // BUG: FormatString

        // Unreachable for loop added as a mutant
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable for loop.");
        }

        return result;
    }

    // Added method to ensure the for loop condition is not a compile-time constant
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        System.out.println(example.showBug());
    }
}