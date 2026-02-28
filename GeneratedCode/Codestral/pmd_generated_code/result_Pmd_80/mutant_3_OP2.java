class UnnecessaryCaseChangeBug {
    public boolean showBug(String buz) {
        boolean answer1 = buz.toUpperCase().equals("BAZ");
        boolean answer1_duplicate = buz.toUpperCase().equals("BAZ"); // Mutant code added
        return answer1;
    }

    public boolean showAnotherBug(String buz) {
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ");
        boolean answer2_duplicate = buz.toUpperCase().equalsIgnoreCase("BAZ"); // Mutant code added
        return answer2;
    }
}