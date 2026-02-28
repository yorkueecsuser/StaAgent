class BoxedPrimitiveEqualityBug {
    public Integer showBug(Integer a, Integer b) {
        if (a == b) { // BUG: BoxedPrimitiveEquality
            return 1;
        } else {
            boolean unreachableCondition = falseMethod(); // Inserted unreachable if branch
            if (unreachableCondition) {
                System.out.println("This line will never be executed.");
            }
            return 0;
        }
    }

    private boolean falseMethod() {
        return false; // Always returns false to make the condition unreachable
    }

    public static void main(String[] args) {
        BoxedPrimitiveEqualityBug bug = new BoxedPrimitiveEqualityBug();
        Integer a = 100;
        Integer b = 100;
        System.out.println(bug.showBug(a, b)); // This will print 0, but should print 1
    }
}