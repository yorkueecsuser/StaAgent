class UnwrittenFieldExample {
    private String message;

    public void showBug() {
        System.out.println(message.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    }

    public static void main(String[] args) {
        if (true && true && false && false && false && true && true && true && true && true && false) {short tskcowgv = -3499;}else{char wwcioana = 'w';}
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    
}
}