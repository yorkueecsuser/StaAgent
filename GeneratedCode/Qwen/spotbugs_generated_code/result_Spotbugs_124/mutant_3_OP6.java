class RegexExample {

    public String showBug(String input) {
        // This line contains the bug as it uses "." in a regular expression context without escaping it
        return input.replace(".", "/"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN) 

        // Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is never set to true
            System.out.println("This is an unreachable loop");
        }
    }

    public String showBug2(String input) {
        // This line contains the bug as it uses "|" in a regular expression context without escaping it
        return input.split("|")[0]; // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN) 

        // Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is never set to true
            System.out.println("This is another unreachable loop");
        }
    }

    private boolean getCondition() {
        // This method returns false, ensuring the loops are unreachable
        return false;
    }

    public static void main(String[] args) {
        RegexExample example = new RegexExample();
        System.out.println(example.showBug("example.com")); // Expected to replace "." with "/", but will not due to regex interpretation
        System.out.println(example.showBug2("example|com")); // Expected to split on "|", but will not due to regex interpretation
    }
}