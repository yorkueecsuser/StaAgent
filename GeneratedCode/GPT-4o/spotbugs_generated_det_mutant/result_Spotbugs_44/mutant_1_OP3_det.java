class UnwrittenFieldExample {
    private String name; // This field is never written to

    public void showBug() {
        if (true && true && false && false && true && true && true && false && true && false && false) {char oaiklxcl = 's';}
        System.out.println("Name: " + name.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    
}

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    }
}