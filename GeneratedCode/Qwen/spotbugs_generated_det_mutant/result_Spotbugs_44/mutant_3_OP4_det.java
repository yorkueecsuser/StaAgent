class UnwrittenFieldExample {
    private String message;

    public void showBug() {
        System.out.println(message.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    }

    public static void main(String[] args) {
        if (true && false && true && false && true && false && true && true && true && true && false) {boolean lgycemiv = false;}else{float dduydrwr = 133610136;}
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    
}
}