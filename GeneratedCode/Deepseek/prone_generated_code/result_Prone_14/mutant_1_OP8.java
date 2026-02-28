class BoxedPrimitiveEqualityBug {
    public Integer showBug() {
        Integer a = new Integer(123);
        Integer b = new Integer(123);
        if (a == b) {
            return a; // BUG: BoxedPrimitiveEquality
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