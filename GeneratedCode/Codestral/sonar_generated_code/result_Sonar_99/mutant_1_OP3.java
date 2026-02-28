class InappropriateRegexExample {
    public String showBug(String str) {
        String clean = str.replaceAll(".", ""); // BUG: Inappropriate regular expression, matches every character
        if (getUnreachableCondition()) { // Mutant: Unreachable if statement
            System.out.println("This line is unreachable");
        }
        return clean;
    }

    // Method to return a false condition dynamically
    private boolean getUnreachableCondition() {
        return false;
    }

    // Rest of the code...
}