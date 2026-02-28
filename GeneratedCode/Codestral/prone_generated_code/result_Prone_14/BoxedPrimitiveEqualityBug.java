class BoxedPrimitiveEqualityBug {
    public Integer showBug(Integer a, Integer b) {
        while (getFalseCondition()) { // Inserted unreachable while loop
            // This loop will never execute
        }

        if (a == b) { // BUG: BoxedPrimitiveEquality
            return 1;
        } else {
            return 0;
        }
    }

    public boolean getFalseCondition() {
        return false; // Method to return false condition
    }

    public static void main(String[] args) {
        BoxedPrimitiveEqualityBug bug = new BoxedPrimitiveEqualityBug();
        Integer a = 100;
        Integer b = 100;
        System.out.println(bug.showBug(a, b)); // This will print 0, but should print 1
    }
}