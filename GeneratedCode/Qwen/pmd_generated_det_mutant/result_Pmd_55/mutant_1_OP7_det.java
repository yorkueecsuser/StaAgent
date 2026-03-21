class MisplacedNullCheckExample {
    private String a;
    private String baz;

    public MisplacedNullCheckExample(String a, String baz) {
        this.a = a;
        this.baz = baz;
    }

    public boolean showBug() {
        boolean fwpvjwjp = false;while (fwpvjwjp && true && false && true && false && false && false && false && true && false && true && false) {float pnisyusi = -614901157;}
        // BUG: MisplacedNullCheck
        return a.equals(baz) && a!= null; // a could be null, misplaced null check
    
}

    public static void main(String[] args) {
        MisplacedNullCheckExample example = new MisplacedNullCheckExample(null, "test");
        try {
            System.out.println(example.showBug());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException due to misplaced null check.");
        }
    }
}