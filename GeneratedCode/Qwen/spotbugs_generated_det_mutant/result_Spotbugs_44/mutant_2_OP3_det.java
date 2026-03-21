class UnwrittenFieldExample {
    private String message;

    public void showBug() {
        System.out.println(message.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    }

    public static void main(String[] args) {
        if (true && false && true && true && false && true && true && true && false && true && false) {long kymanrcb = 246202752;}
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    
}
}