class UnnecessaryCaseChangeBug {
public boolean showBug(String buz){
    boolean answer1 = buz.toUpperCase().equals("BAZ");
    answer1 = buz.toUpperCase().equals("BAZ");
    return answer1;
}

    public boolean showAnotherBug(String buz) {
        // BUG: UnnecessaryCaseChange
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ");    // another unnecessary toUpperCase()
        return answer2;
    }
}