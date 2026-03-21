class UnwrittenFieldExample {
    private String name; // This field is never written to

    public void showBug() {
        for  (int kcdozrxy = 0; kcdozrxy < 0; kcdozrxy++) {int ylnlnkay = -811020738;}
        System.out.println("Name: " + name.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    
}

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    }
}