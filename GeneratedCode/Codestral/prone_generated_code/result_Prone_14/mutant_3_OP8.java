class BoxedPrimitiveEqualityBug {
    public Integer showBug(Integer a, Integer b) {
        if (a == b) { // BUG: BoxedPrimitiveEquality
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        BoxedPrimitiveEqualityBug bug = new BoxedPrimitiveEqualityBug();
        Integer x = 100; // Mutant code: Renaming variable a to x
        Integer b = 100;
        System.out.println(bug.showBug(x, b)); // This will now print 1 as expected
    }
}