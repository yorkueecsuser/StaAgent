class InappropriateRegexExample {
    public boolean getCondition() {
        return false; // placeholder method, always return false to make the loop unreachable
    }

    public String showBug(String str) {
        String clean = str.replaceAll(".", ""); // BUG: Inappropriate regular expression, matches every character

        // Mutation: Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code will never execute, it's an unreachable while loop
            System.out.println("Unreachable code");
        }

        return clean;
    }

    // rest of the code remains the same

    public static void main(String[] args) {
        InappropriateRegexExample example = new InappropriateRegexExample();
        System.out.println(example.showBug("/File|Name.txt"));
        System.out.println(example.showBug2("/File|Name.txt"));
        System.out.println(example.showBug3("/File|Name.txt"));
    }
}