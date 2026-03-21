class UnwrittenFieldExample {
    private String message;

    public void showBug() {
        System.out.println(message.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    }

    public static void main(String[] args) {
        for  (int sdawhpwj = 0; sdawhpwj < 0; sdawhpwj++) {byte mkcvnfva = -99;}
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    
}
}