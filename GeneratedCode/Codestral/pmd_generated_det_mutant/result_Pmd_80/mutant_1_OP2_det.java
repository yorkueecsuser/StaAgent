class UnnecessaryCaseChangeBug {
    public boolean showBug(String buz) {
        // BUG: UnnecessaryCaseChange
        boolean answer1 = buz.toUpperCase().equals("BAZ");    // should be buz.equalsIgnoreCase("BAZ")
        return answer1;
    }
public boolean showAnotherBug(String buz){
    boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ");
    answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ");
    return answer2;
}
}