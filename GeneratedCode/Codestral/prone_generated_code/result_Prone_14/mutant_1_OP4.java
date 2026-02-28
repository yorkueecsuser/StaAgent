class BoxedPrimitiveEqualityBug {
    private boolean getFalseCondition() {
        return false;
    }

    public Integer showBug(Integer a, Integer b) {
        if (a == b) {
            return 1;
        } else if (getFalseCondition()) { // Inserted unreachable if-else branch
            System.out.println("This line should never be executed.");
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        BoxedPrimitiveEqualityBug bug = new BoxedPrimitiveEqualityBug();
        Integer a = 100;
        Integer b = 100;
        System.out.println(bug.showBug(a, b)); // This will print 0, but should print 1
    }
}