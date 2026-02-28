class BoxedPrimitiveEqualityBug {
    public Integer showBug() {
        Integer x = new Integer(123);
        Integer y = new Integer(123);
        if (x == y) {
            return x; // BUG: BoxedPrimitiveEquality
        }
        return null;
    }

    public static void main(String[] args) {
        BoxedPrimitiveEqualityBug bug = new BoxedPrimitiveEqualityBug();
        Integer result = bug.showBug();
        if (result!= null) {
            System.out.println(result);
        } else {
            System.out.println("No bug found");
        }

        // Unreachable while loop mutant
        boolean condition = false;
        while (condition) {
            // unreachable code
        }
    }
}