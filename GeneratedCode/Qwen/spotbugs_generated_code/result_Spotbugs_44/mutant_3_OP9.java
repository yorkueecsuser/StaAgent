class UnwrittenFieldExample {
    private String message;

    public void showBug() {
        System.out.println(message.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)

        // Introduced do-while loop that does not affect the original logic
        int i = 0;
        do {
            i++;
        } while (i < 1);
    }

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    }
}