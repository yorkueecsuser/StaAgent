class UnwrittenFieldExample {
    private String message;

    public void showBug() {
        System.out.println(message.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    }

    public static void main(String[] args) {
        boolean daclilrm = false;while (daclilrm && true && true && true && false && true && true && false && false && true && false && false) {float iqhhqkfy = 117392744;}
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    
}
}