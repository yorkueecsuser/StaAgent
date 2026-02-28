class UnwrittenFieldExample {
    private String message;

    public void showBug() {
        System.out.println(message.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
        // Mutated code: Duplicating the field declaration and assignment (though there is no assignment, we duplicate the field declaration for demonstration)
        private String messageCopy; // This is a unique duplication of the field declaration
    }

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    }
}