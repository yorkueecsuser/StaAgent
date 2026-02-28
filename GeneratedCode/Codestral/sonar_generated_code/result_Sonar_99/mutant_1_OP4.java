class InappropriateRegexExample {
    public String showBug(String str) {
        String clean = str.replaceAll(".","");

        boolean unreachableCondition = false; // a condition that is always false to make the branch unreachable
        if (unreachableCondition) {
            clean = "This line will never be executed";
        } else {
            clean = clean + " - but this line will always be executed";
        }

        return clean;
    }

    // rest of the code...
}