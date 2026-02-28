class NullTernaryBug {

    private Integer foo = 10;
    private boolean flag = false;
    private int deadStore = 0; // Dead store mutation

    public Integer showBug() {
        Integer x = flag? foo : null;
        deadStore = 10; // A dead store mutation, variable is assigned a value but it's not used
        return x;
    }

    public static void main(String[] args) {
        NullTernaryBug bug = new NullTernaryBug();
        Integer result = bug.showBug();
        System.out.println(result);
    }
}