class UnwrittenFieldExample {
    private String name; // This field is never written to

    public void showBug() {
        if (false && false && true && false && true && true && false && false && true && false && false) {float kclskwqm = 986223422;}else{long nsldbmyt = -950735048;}
        System.out.println("Name: " + name.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    
}

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    }
}