class MisplacedNullCheckExample {
    private String a;
    private String baz;

    public MisplacedNullCheckExample(String a, String baz) {
        this.a = a;
        this.baz = baz;
    }

    public boolean showBug() {
        // BUG: MisplacedNullCheck
        return a.equals(baz) && a!= null; // a could be null, misplaced null check
    }

    // Mutant with renaming operator applied to variable 'a'
    public boolean showBugMutant() {
        // Renamed variable 'a' to 'x'
        String x = this.a;
        return x.equals(baz) && x!= null; // x could be null, misplaced null check
    }

    public static void main(String[] args) {
        MisplacedNullCheckExample example = new MisplacedNullCheckExample(null, "test");
        try {
            System.out.println(example.showBug());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException due to misplaced null check.");
        }

        // Testing the mutant
        try {
            System.out.println(example.showBugMutant());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException due to misplaced null check in mutant.");
        }
    }
}