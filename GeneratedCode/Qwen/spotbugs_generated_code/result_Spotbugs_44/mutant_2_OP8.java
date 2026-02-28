class UnwrittenFieldExample {
    private String message;

    public void showBug() {
        System.out.println(message.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD) 
    }

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    }

    // Mutated code
    private String z;

    public void display() {
        System.out.println(z); // This is a renamed variable 'z' that is not related to the bug
    }
}