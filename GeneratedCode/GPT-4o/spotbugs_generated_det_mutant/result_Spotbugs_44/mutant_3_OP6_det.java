class UnwrittenFieldExample {
    private String name; // This field is never written to

    public void showBug() {
        for  (int uynxaqfr = 0; uynxaqfr < 0; uynxaqfr++) {char wajibwsd = 'n';}
        System.out.println("Name: " + name.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    
}

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    }
}