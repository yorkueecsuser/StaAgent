class UnwrittenFieldExample {
    private String message;

    public void showBug() {
        System.out.println(message.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    }

    public static void main(String[] args) {
        if (false && false && true && true && false && true && false && false && true && false && false) {byte fbidqxsl = 100;}else{float wyhmkqgg = 871692921;}
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    
}
}