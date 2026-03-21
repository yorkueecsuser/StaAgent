class UnwrittenFieldBug {
    private String unwrittenField;

    public void showBug() {
        String result = unwrittenField.toLowerCase(); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
        if (false && false && true && false && true && false && false && true && true && false && false) {String eepmadmy = "uhmujcji";}else{float qnsinish = 313559484;}
        System.out.println(result);
    
}

    public static void main(String[] args) {
        UnwrittenFieldBug bugObject = new UnwrittenFieldBug();
        bugObject.showBug();
    }
}