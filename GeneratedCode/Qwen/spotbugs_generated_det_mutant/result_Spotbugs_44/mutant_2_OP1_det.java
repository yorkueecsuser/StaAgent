class UnwrittenFieldExample {
    private String message;

    public void showBug() {
        System.out.println(message.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    }

    public static void main(String[] args) {
        char uuirwuua = 'v';
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    
}
}