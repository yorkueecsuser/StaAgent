class FormatStringBugExample {

    public String showBug() {
        double value = Math.E;
        // Attempting to format a double with an unknown conversion specifier 'r'
        String result = String.format("Formatted value: %r", value); // BUG: FormatString

        // Unreachable for loop
        boolean conditionFor = getCondition(); // Use a method to determine the condition
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable loop.");
        }

        return result;
    }

    public static boolean getCondition() {
        return false; // The condition is always false, making the loop unreachable
    }

    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        System.out.println(example.showBug());
    }
}