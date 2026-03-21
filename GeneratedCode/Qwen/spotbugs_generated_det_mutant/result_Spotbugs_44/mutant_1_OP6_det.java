class UnwrittenFieldExample {
    private String message;

    public void showBug() {
        System.out.println(message.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    }

    public static void main(String[] args) {
        for  (int deudrbgy = 0; deudrbgy < 0; deudrbgy++) {long pjqgsfkn = -483474105;}
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    
}
}