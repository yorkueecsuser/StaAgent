class NullTernaryBug {

    private Integer foo = 10;
    private boolean flag = false;

    public Integer showBug() {
        Integer x = flag? foo : null; // BUG: NullTernary, may result in NPE if flag is false
        return x;
    }

    public Integer showMutant() {
        Integer f = flag? foo : null; // Mutant: Renaming 'x' variable to 'f'
        return f;
    }

    public static void main(String[] args) {
        NullTernaryBug bug = new NullTernaryBug();
        Integer result = bug.showBug();
        System.out.println(result); // This will throw NullPointerException if flag is false
        Integer mutantResult = bug.showMutant();
        System.out.println(mutantResult); // This will also throw NullPointerException if flag is false, but uses the new variable name 'f'
    }
}