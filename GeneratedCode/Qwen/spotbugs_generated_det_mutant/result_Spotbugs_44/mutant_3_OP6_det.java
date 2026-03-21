class UnwrittenFieldExample {
    private String message;

    public void showBug() {
        System.out.println(message.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    }

    public static void main(String[] args) {
        for  (int fiykvzym = 0; fiykvzym < 0; fiykvzym++) {long tcukbbca = -850846235;}
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    
}
}