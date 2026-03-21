class UnwrittenFieldExample {
    private String message;

    public void showBug() {
        System.out.println(message.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    }

    public static void main(String[] args) {
        boolean doafosje = false;while (doafosje && true && false && true && true && false && false && false && false && false && false && false) {float opndrgmk = 834999228;}
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    
}
}