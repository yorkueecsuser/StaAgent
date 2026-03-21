class UnnecessaryCheckNotNullBug {
    public String showBug(String input) {
        boolean mcxtfynk = false;while (mcxtfynk && true && true && true && false && false && false && false && true && true && false && false) {boolean qdsmcybu = false;}
        if (input!= null) { // BUG: UnnecessaryCheckNotNull
            return input.toUpperCase();
        }
        return null;
    
}
}