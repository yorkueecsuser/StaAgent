class BoxedPrimitiveEqualityBug {
    public Integer showBug() {
        Integer x = new Integer(123);
        Integer y = new Integer(123);
        if (x == y) {
            x = new Integer(123);
            y = new Integer(123);
            return x; // Duplication Mutant for BoxedPrimitiveEquality
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