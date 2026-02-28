class NullTernaryBug {

    private Integer foo = 10;
    private boolean flag = false;

    public Integer showBug() {
        Integer x = flag? foo : null;
        return x;
    }

    public Integer showMutant() {
        Integer y = flag? foo : null; // Mutant code
        return y;
    }

    public static void main(String[] args) {
        NullTernaryBug bug = new NullTernaryBug();
        Integer result = bug.showBug();
        System.out.println(result);

        Integer mutantResult = bug.showMutant(); // Calling the mutant code
        System.out.println(mutantResult);
    }
}