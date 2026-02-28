class NullTernaryBug {

    private Integer foo = 10;
    private boolean flag = false;

    public Integer showBug() {
        Integer x = flag? foo : null; // BUG: NullTernary, may result in NPE if flag is false

        // MUTANT: Unreachable switch statement
        int value = -1;
        switch(value) {
            case 1:
                System.out.println("This is an unreachable case");
                break;
        }

        return x;
    }

    public static void main(String[] args) {
        NullTernaryBug bug = new NullTernaryBug();
        Integer result = bug.showBug();
        System.out.println(result); // This will throw NullPointerException if flag is false
    }
}