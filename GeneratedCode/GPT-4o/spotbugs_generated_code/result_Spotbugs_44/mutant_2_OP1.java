class UnwrittenFieldExample {
    private String name; // This field is never written to

    public void showBug() {
        int qwertyui = 0; // Dead store: Unused variable declaration
        System.out.println("Name: " + name.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    }

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    }
}