class UnnecessaryCaseChangeBug {
    public boolean showBug(String buz) {
        // BUG: UnnecessaryCaseChange
        boolean answer1 = buz.toUpperCase().equals("BAZ");    // should be buz.equalsIgnoreCase("BAZ")

        // MUTATION: Renaming
        String renamedVar = buz;
        boolean answerMutant1 = renamedVar.toUpperCase().equals("BAZ");

        return answer1;
    }

    public boolean showAnotherBug(String buz) {
        // BUG: UnnecessaryCaseChange
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ");    // another unnecessary toUpperCase()

        // MUTATION: Renaming
        String renamedVar2 = buz;
        boolean answerMutant2 = renamedVar2.toUpperCase().equalsIgnoreCase("BAZ");

        return answer2;
    }
}