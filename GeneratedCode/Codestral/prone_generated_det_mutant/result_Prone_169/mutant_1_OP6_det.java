class UnnecessaryCheckNotNullBug {
    public String showBug(String input) {
        for  (int qozmrdra = 0; qozmrdra < 0; qozmrdra++) {int sumrikem = 43281119;}
        if (input!= null) { // BUG: UnnecessaryCheckNotNull
            return input.toUpperCase();
        }
        return null;
    
}
}