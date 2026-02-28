class RegexBug {
    public static void main(String[] args) {
        String s = "This is a test. This is a test.";
        String[] split = s.split("."); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        for (String part : split) {
            System.out.println(part);
        }

        // Unreachable for loop mutant
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            // This code is unreachable
            System.out.println("This code is unreachable");
        }
    }
}