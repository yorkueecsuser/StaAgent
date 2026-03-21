class UnwrittenFieldExample {
    private String name; // This field is never written to

    public void showBug() {
        if (true && false && true && true && true && true && true && true && false && false && false) {boolean bpzuufeg = false;}
        System.out.println("Name: " + name.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    
}

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    }
}