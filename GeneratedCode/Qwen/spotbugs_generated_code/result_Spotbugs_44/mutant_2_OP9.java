class UnwrittenFieldExample {
    private String message;

    public void showBug() {
        // Introducing a benign loop
        int i = 0;
        while (i < 1) {
            i++;
        }

        // Equivalent Loop Replacement: Replacing the while loop with a do-while loop
        int j = 0;
        do {
            j++;
        } while (j < 1);

        System.out.println(message.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    }

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    }
}