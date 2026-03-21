class UnnecessaryCheckNotNullBug {
    public String showBug(String input) {
        boolean qsgqpszp = true;
        if (input!= null) { // BUG: UnnecessaryCheckNotNull
            return input.toUpperCase();
        }
        return null;
    
}
}