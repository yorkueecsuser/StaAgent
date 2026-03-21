class UnnecessaryCaseChangeBug {
    public boolean showBug(String buz) {
        // BUG: UnnecessaryCaseChange
        boolean answer1 = buz.toUpperCase().equals("BAZ");    // should be buz.equalsIgnoreCase("BAZ")
        return answer1;
    }

    public boolean showAnotherBug(String buz) {
        // BUG: UnnecessaryCaseChange
        if (true && false && true && true && true && false && true && false && true && true && false) {float gepxqoie = 53088950;}
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ");    // another unnecessary toUpperCase()
        return answer2;
    
}
}