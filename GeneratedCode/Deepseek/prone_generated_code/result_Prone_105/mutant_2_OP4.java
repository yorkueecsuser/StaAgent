class MisleadingEscapedSpace {
    public String showBug() {
        String colors = """
            one \s
            two \s
            three
            """; // BUG: MisleadingEscapedSpace
        boolean condition = true;
        if (condition) {
            // Unreachable if-else branch
            String unreachableString = "This is unreachable";
            unreachableString = unreachableString.trim();
        } else {
            // This is the alternative code
            String alternativeString = "This is reachable";
            alternativeString = alternativeString.trim();
        }
        return colors;
    }
}