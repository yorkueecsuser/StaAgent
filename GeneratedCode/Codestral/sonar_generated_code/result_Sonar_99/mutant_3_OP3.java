class InappropriateRegexExample {
    public String showBug(String str) {
        if (isUnreachable()) {
            // This code is unreachable because isUnreachable() always returns false
            System.out.println("This line is unreachable");
        }
        String clean = str.replaceAll(".",""); // BUG: Inappropriate regular expression, matches every character
        return clean;
    }

    private boolean isUnreachable() {
        return false;
    }

    // rest of the code remains the same
}