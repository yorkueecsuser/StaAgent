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
        Integer a = 100;
        Integer b = 100;
        Integer b2 = 100; // Mutation: Duplication of assignment
        System.out.println(bug.showBug(a, b)); // This will print 0, but should print 1
        System.out.println(bug.showBug(a, b2)); // New line added for the duplicated assignment
    }
}