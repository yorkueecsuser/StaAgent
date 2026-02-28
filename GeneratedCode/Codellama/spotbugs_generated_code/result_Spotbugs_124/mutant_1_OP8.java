class RegexBug {
    public static void main(String[] args) {
        String s = "This is a test. This is a test.";
        String[] split = s.split("."); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        for (String part : split) {
            System.out.println(part);
        }
    }
}

// Mutant 1: Renaming variable's' to'str'
class RegexBugMutant1 {
    public static void main(String[] args) {
        String str = "This is a test. This is a test.";
        String[] split = str.split("."); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        for (String part : split) {
            System.out.println(part);
        }
    }
}

// Mutant 2: Renaming variable'split' to 'parts'
class RegexBugMutant2 {
    public static void main(String[] args) {
        String s = "This is a test. This is a test.";
        String[] parts = s.split("."); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        for (String part : parts) {
            System.out.println(part);
        }
    }
}

// Mutant 3: Renaming variable 'part' to 'current'
class RegexBugMutant3 {
    public static void main(String[] args) {
        String s = "This is a test. This is a test.";
        String[] split = s.split("."); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        for (String current : split) {
            System.out.println(current);
        }
    }
}