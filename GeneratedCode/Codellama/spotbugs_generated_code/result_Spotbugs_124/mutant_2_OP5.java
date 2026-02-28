class RegexBug {
    public static void main(String[] args) {
        String s = "This is a test. This is a test.";
        String[] split = s.split("."); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        for (String part : split) {
            System.out.println(part);
        }

        // Unreachable switch statement
        int value = getValue();
        switch(value) {
            case 1: /* code */ break;
            case 2: /* code */ break;
            case 3: /* code */ break;
            default: /* code */ break;
        }
    }

    private static int getValue() {
        return 0;
    }
}