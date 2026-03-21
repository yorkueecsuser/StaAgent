class UnwrittenFieldExample {
    private String name; // This field is never written to

    public void showBug() {
        boolean clxnvyfs = false;while (clxnvyfs && false && false && false && true && false && true && true && false && false && false && false) {boolean clefiool = true;}
        System.out.println("Name: " + name.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    
}

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    }
}