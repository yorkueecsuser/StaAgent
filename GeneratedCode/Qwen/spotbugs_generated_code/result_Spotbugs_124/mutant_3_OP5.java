class RegexExample {

    public String showBug(String input) {
        // This line contains the bug as it uses "." in a regular expression context without escaping it
        return input.replace(".", "/"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN) 

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is never true
                System.out.println("This is an unreachable case");
                break;
        }
    }

    public String showBug2(String input) {
        // This line contains the bug as it uses "|" in a regular expression context without escaping it
        return input.split("|")[0]; // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN) 

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is never true
                System.out.println("This is another unreachable case");
                break;
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the switch condition always evaluate to the unreachable case
        return false;
    }

    public static void main(String[] args) {
        RegexExample example = new RegexExample();
        System.out.println(example.showBug("example.com")); // Expected to replace "." with "/", but will not due to regex interpretation
        System.out.println(example.showBug2("example|com")); // Expected to split on "|", but will not due to regex interpretation
    }
}