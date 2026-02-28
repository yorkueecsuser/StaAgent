class BoxedPrimitiveEqualityBug {
    public boolean getFalseCondition() {
        return false;
    }

    public Integer showBug(Integer a, Integer b) {
        if (a == b) {
            return 1;
        } else {
            return 0;
        }

        if (getFalseCondition()) { // Unreachable if statement
            System.out.println("Unreachable code.");
        }
    }

    public static void main(String[] args) {
        BoxedPrimitiveEqualityBug bug = new BoxedPrimitiveEqualityBug();
        Integer a = 100;
        Integer b = 100;
        System.out.println(bug.showBug(a, b)); // This will print 0, but should print 1
    }
}