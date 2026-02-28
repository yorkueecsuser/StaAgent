class BoxedPrimitiveEqualityBug {
    private boolean getCondition() {
        return false;
    }

    public Integer showBug(Integer a, Integer b) {
        if (a == b) {
            while (getCondition()) { // Mutant: Unreachable while loop
                System.out.println("This line should never print");
            }
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        BoxedPrimitiveEqualityBug bug = new BoxedPrimitiveEqualityBug();
        Integer a = 100;
        Integer b = 100;
        System.out.println(bug.showBug(a, b)); // This will print 1
    }
}