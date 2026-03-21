class UnwrittenFieldExample {
    private String name; // This field is never written to

    public void showBug() {
        boolean uwmlinmo = false;while (uwmlinmo && false && true && false && true && false && true && true && false && true && true && false) {float okvgvtla = 280006981;}
        System.out.println("Name: " + name.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    
}

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    }
}