class InappropriateRegexExample {
    public String showBug(String str) {
        String clean = str.replaceAll(".",""); // BUG: Inappropriate regular expression, matches every character
        if(getUnreachableCondition()) { // Mutant code: Unreachable if statement
            System.out.println("This line will never be executed.");
        }
        return clean;
    }

    public String showBug2(String str) {
        String clean = str.replaceAll("|","_"); // BUG: Inappropriate regular expression, matches the space between characters
        if(getUnreachableCondition()) { // Mutant code: Unreachable if statement
            System.out.println("This line will never be executed.");
        }
        return clean;
    }

    public String showBug3(String str) {
        String clean = str.replaceAll(java.io.File.separator,""); // BUG: Inappropriate regular expression, matches the platform-specific file path delimiter
        if(getUnreachableCondition()) { // Mutant code: Unreachable if statement
            System.out.println("This line will never be executed.");
        }
        return clean;
    }

    private boolean getUnreachableCondition() {
        return false; // This method ensures that the condition is dynamically determined at runtime.
    }

    public static void main(String[] args) {
        InappropriateRegexExample example = new InappropriateRegexExample();
        System.out.println(example.showBug("/File|Name.txt"));
        System.out.println(example.showBug2("/File|Name.txt"));
        System.out.println(example.showBug3("/File|Name.txt"));
    }
}