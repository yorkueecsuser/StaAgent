class UnnecessaryCaseChangeBug {
    public boolean showBug(String buz) {
        boolean answer1 = buz.toUpperCase().equals("BAZ");
        boolean duplicatedAnswer1 = buz.toUpperCase().equals("BAZ"); // Mutant: Duplicated assignment
        return answer1;
    }

    public boolean showAnotherBug(String buz) {
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ");
        boolean duplicatedAnswer2 = buz.toUpperCase().equalsIgnoreCase("BAZ"); // Mutant: Duplicated assignment
        return answer2;
    }
}