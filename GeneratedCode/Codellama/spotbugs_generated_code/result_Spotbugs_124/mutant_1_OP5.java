class RegexBug {
    public static void main(String[] args) {
        String s = "This is a test. This is a test.";
        String[] split = s.split("."); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        for (String part : split) {
            System.out.println(part);
        }

        // Unreachable switch statement
        int value = getValue();
        switch (value) {
            case 1:
                System.out.println("This switch statement is unreachable!");
                break;
            default:
                System.out.println("This switch statement is unreachable!");
                break;
        }
    }

    private static int getValue() {
        // This method always returns 0, making the switch statement unreachable
        return 0;
    }
}