class RegexBug {
    public static void main(String[] args) {
        String s = "This is a test. This is a test.";
        String[] split = s.split("."); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        for (String part : split) {
            System.out.println(part);
        }

        // Unreachable switch statement mutant
        int value = getValue();
        switch(value) {
            case 1:
                // code
                break;
            default:
                // code
                break;
        }
    }

    private static int getValue() {
        // This method will always return 0, making the switch statement unreachable
        return 0;
    }
}