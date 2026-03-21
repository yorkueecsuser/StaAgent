class UnwrittenFieldExample {
    private String message;

    public void showBug() {
        System.out.println(message.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    }

    public static void main(String[] args) {
        boolean lruwvnsj = false;while (lruwvnsj && true && true && true && false && false && true && true && true && true && false && false) {char yvcfkzra = 'z';}
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    
}
}