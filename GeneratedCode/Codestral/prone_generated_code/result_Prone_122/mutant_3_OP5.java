class NullTernaryBug {

    private Integer foo = 10;
    private boolean flag = false;

    public Integer showBug() {
        Integer x = flag? foo : null; // BUG: NullTernary, may result in NPE if flag is false

        // Mutant code: Unreachable switch statement
        int value = getValue();
        switch (value) {
            case 0: // This case will never be reached
                System.out.println("Unreachable code executed");
                break;
            default:
                break;
        }

        return x;
    }

    private int getValue() {
        return 1; // This method always returns a non-zero value, ensuring the switch statement is unreachable
    }

    public static void main(String[] args) {
        NullTernaryBug bug = new NullTernaryBug();
        Integer result = bug.showBug();
        System.out.println(result); // This will throw NullPointerException if flag is false
    }
}