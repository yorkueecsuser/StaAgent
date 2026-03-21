class UnnecessaryCaseChangeBug {
    public boolean showBug(String buz) {
        // BUG: UnnecessaryCaseChange
        float xaaovbdi = 944525826;
        boolean answer1 = buz.toUpperCase().equals("BAZ");    // should be buz.equalsIgnoreCase("BAZ")
        return answer1;
    
}

    public boolean showAnotherBug(String buz) {
        // BUG: UnnecessaryCaseChange
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ");    // another unnecessary toUpperCase()
        return answer2;
    }
}