class UnwrittenFieldExample {
    private String name; // This field is never written to

    public void showBug() {
        if (true && true && true && false && true && false && false && false && false && true && false) {double boxdaihe = -183903;}else{short cfbkmjwz = -8095;}
        System.out.println("Name: " + name.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    
}

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    }
}