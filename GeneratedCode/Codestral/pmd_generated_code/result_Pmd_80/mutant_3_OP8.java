class UnnecessaryCaseChangeBug {
    public boolean showBug(String buz) {
        // BUG: UnnecessaryCaseChange
        String x = buz;
        boolean answer1 = x.toUpperCase().equals("BAZ");    // should be x.equalsIgnoreCase("BAZ")
        return answer1;
    }

    public boolean showAnotherBug(String buz) {
        // BUG: UnnecessaryCaseChange
        String y = buz;
        boolean answer2 = y.toUpperCase().equalsIgnoreCase("BAZ");    // another unnecessary toUpperCase()
        return answer2;
    }
}