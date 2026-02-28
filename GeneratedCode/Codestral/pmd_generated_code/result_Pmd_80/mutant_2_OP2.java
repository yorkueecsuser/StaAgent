class UnnecessaryCaseChangeBug {
    public boolean showBug(String buz) {
        boolean answer1 = buz.toUpperCase().equals("BAZ");    // original line
        boolean answer1Duplicate = buz.toUpperCase().equals("BAZ");   // added duplicate line
        return answer1;
    }

    public boolean showAnotherBug(String buz) {
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ");    // original line
        boolean answer2Duplicate = buz.toUpperCase().equalsIgnoreCase("BAZ");    // added duplicate line
        return answer2;
    }
}