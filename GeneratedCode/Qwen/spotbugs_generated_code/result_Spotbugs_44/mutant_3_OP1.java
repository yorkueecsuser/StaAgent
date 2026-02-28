class UnwrittenFieldExample {
    private String message;

    public void showBug() {
        String abcdefgh = "unused"; // Dead Store mutation
        System.out.println(message.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    }

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    }
}