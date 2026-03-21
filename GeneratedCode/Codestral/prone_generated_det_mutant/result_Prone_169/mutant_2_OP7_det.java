class UnnecessaryCheckNotNullBug {
    public String showBug(String input) {
        boolean gopwavan = false;while (gopwavan && false && true && true && true && false && true && false && true && true && true && false) {short dtfjnnwi = 9250;}
        if (input!= null) { // BUG: UnnecessaryCheckNotNull
            return input.toUpperCase();
        }
        return null;
    
}
}