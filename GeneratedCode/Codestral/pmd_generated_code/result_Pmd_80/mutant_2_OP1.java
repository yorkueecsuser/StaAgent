class UnnecessaryCaseChangeBug {
    public boolean showBug(String buz) {
        String deadstore = "unused"; // Dead store
        boolean answer1 = buz.toUpperCase().equals("BAZ");
        return answer1;
    }

    public boolean showAnotherBug(String buz) {
        int deadstore = 123; // Dead store
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ");
        return answer2;
    }
}