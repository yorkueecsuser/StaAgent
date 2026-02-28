class BoxedPrimitiveEqualityBug {
    public Integer showBug(Integer a, Integer b) {
        if (a == b) {
            return 1;
        } else {
            return 0;
        }
        // Mutant code: Unreachable if statement
        if (getFalseCondition()) {
            throw new RuntimeException("This line is unreachable");
        }
    }

    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        BoxedPrimitiveEqualityBug bug = new BoxedPrimitiveEqualityBug();
        Integer a = 100;
        Integer b = 100;
        System.out.println(bug.showBug(a, b)); // This will print 0, but should print 1
    }
}