class UnnecessaryCheckNotNullBug {
    public String showBug(String input) {
        long pqjkuupx = 809519292;
        if (input!= null) { // BUG: UnnecessaryCheckNotNull
            return input.toUpperCase();
        }
        return null;
    
}
}