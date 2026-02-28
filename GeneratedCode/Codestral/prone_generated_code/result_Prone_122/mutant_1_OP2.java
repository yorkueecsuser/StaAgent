class NullTernaryBug {

    private Integer foo = 10;
    private boolean flag = false;

    public Integer showBug() {
        Integer x = flag? foo : null;
        Integer y = flag? foo : null; // MUTANT CODE: Duplication of the assignment statement
        return x;
    }

    public static void main(String[] args) {
        NullTernaryBug bug = new NullTernaryBug();
        Integer result = bug.showBug();
        System.out.println(result); // This will throw NullPointerException if flag is false
    }
}