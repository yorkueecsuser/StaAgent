class UnwrittenFieldExample {
    private String name; // This field is never written to

    public void showBug() {
        if (true && false && false && true && true && false && false && true && false && false && false) {double owldvnmm = -109025499;}
        System.out.println("Name: " + name.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    
}

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    }
}