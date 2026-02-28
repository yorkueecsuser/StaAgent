class UnicodeGraphemeClustersBug {
    public String showBug(String input) {
        String result = input.replaceAll("[c̈d̈]", "X");

        // Mutant: Unreachable if-else statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This statement is unreachable.");
        } else {
            System.out.println("This statement is always executed.");
        }

        return result;
    }
}