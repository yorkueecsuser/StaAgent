class NullTernaryBug {

    private Integer foo = 10;
    private boolean flag = false;

    public Integer showBug() {
        Integer x = flag? foo : null; // Original code
        Integer a = flag? x : null; // Mutant code: Renaming 'x' to 'a'
        return a;
    }

    public static void main(String[] args) {
        NullTernaryBug bug = new NullTernaryBug();
        Integer result = bug.showBug();
        System.out.println(result); // This will throw NullPointerException if flag is false
    }
}