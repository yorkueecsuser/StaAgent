class UnnecessaryCheckNotNullBug {
    public String showBug(String input) {
        if (input!= null) { // BUG: UnnecessaryCheckNotNull
            return input.toUpperCase();
        }
        return null;
    }
}