class UnnecessaryCheckNotNullBug {
    public String showBug(String input) {
        String trifpaba = "wgftfyeg";
        if (input!= null) { // BUG: UnnecessaryCheckNotNull
            return input.toUpperCase();
        }
        return null;
    
}
}