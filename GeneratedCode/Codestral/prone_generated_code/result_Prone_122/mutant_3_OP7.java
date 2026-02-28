class NullTernaryBug {

    private Integer foo = 10;
    private boolean flag = false;

    public boolean getFalse() {
        return false;
    }

    public Integer showBug() {
        Integer x = flag? foo : null;
        while (getFalse()) {
            // This loop is unreachable
            System.out.println("This line will never execute.");
        }
        return x;
    }

    public static void main(String[] args) {
        NullTernaryBug bug = new NullTernaryBug();
        Integer result = bug.showBug();
        System.out.println(result); // This will throw NullPointerException if flag is false
    }
}