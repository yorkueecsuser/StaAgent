class BoxedPrimitiveEqualityBug {
    public Integer showBug() {
        Integer x = new Integer(123);
        Integer y = new Integer(123);
        boolean condition = true;
        if (x == y) {
            return x; // BUG: BoxedPrimitiveEquality
        } else if (condition) {
            System.out.println("This is an unreachable if-else statement");
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
    }
}